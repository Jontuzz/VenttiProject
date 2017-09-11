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
        //System.out.println("Pelaajan korttien summa: " + this.pelaajanKorttiSumma);
        //System.out.println("Emannan korttien summa: " + this.emannanKorttiSumma);

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
            if (this.pelaajanKorttiSumma == this.maksimiArvo && this.emannanKorttiSumma > this.maksimiArvo) {
                return "Pelaaja voitti!";
            } else if (this.emannanKorttiSumma == this.maksimiArvo && this.pelaajanKorttiSumma > this.maksimiArvo) {
                return "Emäntä voitti!";
            } else if (this.pelaajanKorttiSumma <= this.maksimiArvo && this.pelaajanKorttiSumma > this.emannanKorttiSumma || this.pelaajanKorttiSumma < this.emannanKorttiSumma && this.emannanKorttiSumma > this.maksimiArvo && this.pelaajanKorttiSumma < this.maksimiArvo) {
                //Pelaajan korttien summa on pienempi tai yhtäsuuri kuin maksimi JA pelaajan korttien summa on suurempi kuin emännän TAI pelaajan korttien summa on pienempi kuin emännän korttien summa JA emännän korttien summa on suurempi kuin maksimi JA pelaajan korttien summa pienempi kuim maksimi
                return "Pelaaja voitti!";
            } else if (this.emannanKorttiSumma <= this.maksimiArvo && this.emannanKorttiSumma > this.pelaajanKorttiSumma || this.emannanKorttiSumma < this.pelaajanKorttiSumma && this.pelaajanKorttiSumma > this.maksimiArvo && this.emannanKorttiSumma < this.maksimiArvo) {
                //Emännän korttien summa on pienempi kuin maksimi JA emännän korttien summa on suurempi kuin pelaajan TAI emännän korttien summa on pienempi kuin pelaahan JA pelaajan korttien summa on suurempi kuin maksimi JA emannan korttien summa on pienempi kuin maksimi
                return "Emäntä voitti!";
            } else {
                return "Kumpikaan ei voittanut!";
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
