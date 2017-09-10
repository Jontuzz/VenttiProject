package ventti;

import javax.swing.JFrame;

public class TarkistaVoitto {
    private int emannanKorttienSumma;
    private int pelaajanKorttienSumma;
    private int maksimiArvo;
    
    public TarkistaVoitto(int emannanKorttienSumma, int pelaajanKorttienSumma) {
        this.emannanKorttienSumma = emannanKorttienSumma;
        this.pelaajanKorttienSumma = pelaajanKorttienSumma;
        this.maksimiArvo = 21;
    }
    
    public String kumpiVoitti() {
        if (this.emannanKorttienSumma > this.pelaajanKorttienSumma && this.emannanKorttienSumma <= this.maksimiArvo) {
            return "Emäntä voitti!";
        } else {
            if (this.emannanKorttienSumma < this.maksimiArvo && this.pelaajanKorttienSumma > this.maksimiArvo) {
                return "Emäntä voitti";
            } else if (this.emannanKorttienSumma > this.maksimiArvo && this.pelaajanKorttienSumma > this.maksimiArvo) {
                return "Kumpikaan ei voittanut!";
            } else if (this.emannanKorttienSumma == this.pelaajanKorttienSumma) {
                return "Emäntä voitti!";
            }
            return "Pelaaja voitti!";
        }
    }
    
}

