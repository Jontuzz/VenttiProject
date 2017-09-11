package ventti;

import javax.swing.JFrame;

public class TarkistaVoitto {

    private final int emannanKorttiSumma;
    private final int pelaajanKorttiSumma;
    private final int pelaajanKorttienMaara;
    private final int maksimiArvo;

    public TarkistaVoitto(int emannanKorttienSumma, int pelaajanKorttienSumma, int palaajanKorttienLKM) {
        this.emannanKorttiSumma = emannanKorttienSumma;
        this.pelaajanKorttiSumma = pelaajanKorttienSumma;
        this.pelaajanKorttienMaara = palaajanKorttienLKM;
        this.maksimiArvo = 21;
    }

    public String kumpiVoitti() {

        if (this.pelaajanKorttiSumma > this.emannanKorttiSumma && this.pelaajanKorttiSumma <= this.maksimiArvo) {
            //Pelaajan korttienSumma on suurempi kuin emännän, mutta pienempi kuin maksimi
            return "Pelaaja voitti!";
        } else if (this.emannanKorttiSumma > this.pelaajanKorttiSumma && this.emannanKorttiSumma <= this.maksimiArvo) {
            //Emännän korttienSumma on suurempi kuin pelaajan, mutta pienempi kuin maksimi
            return "Emäntä voitti!";
        } else {
            //Emäntänä haluan että voitan tasatilanteessa
            if (this.emannanKorttiSumma == this.pelaajanKorttiSumma) {
                return "Tasatilanne: Emäntä voitti!";
            } else if (this.emannanKorttiSumma == 20 && onkoPelaajanKasiVentti()) {
                //Emäntänä haluan että voitan myös jos oman käteni arvo on 20 vaikka pelaajalla olisi ventti
                //sama kuin "emannanKorttiSumma == 20 && onkoPelaajanKasiVentti() == true"
                return "Emäntä voitti! Pelaajalla Ventti, mutta emännän korttien summa 20";
            } else if (onkoPelaajanKasiVentti()) {
                //Pelaajana haluan että käteni on ventti jos siinä on viisi korttia vaikka arvo on alle 21
                return "Ventti, Pelaaja Voitti";
            } else {
                return "Kumpikaan ei voittanut, koska moelmmilla liian suuri summa!";
            }
        }
    }

    private boolean onkoPelaajanKasiVentti() {

        //Katsotaan, onko pelaajalla viisi korttia, joiden arvo on < 21
        if (this.pelaajanKorttienMaara == 5 && this.pelaajanKorttiSumma < this.maksimiArvo) {
            return true;
        }
        return false;
    }

}
