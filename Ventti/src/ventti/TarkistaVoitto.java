package ventti;

public class TarkistaVoitto {
    private int emannanKorttienSumma;
    private int pelaajanKorttienSumma;
    private int maksimiArvo;
    
    public TarkistaVoitto(int emannanKorttienSumma, int pelaajanKorttienSumma) {
        this.emannanKorttienSumma = emannanKorttienSumma;
        this.pelaajanKorttienSumma = pelaajanKorttienSumma;
        this.maksimiArvo = 21;
    }
    
    public void kumpiVoitti() {
        if (this.emannanKorttienSumma > this.pelaajanKorttienSumma && this.emannanKorttienSumma <= this.maksimiArvo) {
            System.out.println("Emäntä voitti!");
        } else {
            System.out.println("Pelaaja voitti");
        }
    }
}
