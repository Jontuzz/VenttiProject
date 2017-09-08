package ventti;

import java.util.ArrayList;

public class Pelaaja {
    private ArrayList<Kortti> pelaajanPelaamatKortit;
    
    public Pelaaja() {
        this.pelaajanPelaamatKortit = new ArrayList<>();
    }
    
    public void lisaaKorttiPelaajalle(Kortti pelaajanKortti) {
        this.pelaajanPelaamatKortit.add(pelaajanKortti);
    }
    
    public int getPelaajanKorttienSumma() {
        int korttienSumma = 0;
        
        for (Kortti pelaajanKortit : pelaajanPelaamatKortit) {
            korttienSumma += pelaajanKortit.getArvo();
        }
        
        return korttienSumma;
    }
    
    public String toString() {
        return "Pelaajan korttipakka" + this.pelaajanPelaamatKortit;
    }
}
