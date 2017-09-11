package ventti;

import java.util.ArrayList;

public class Pelaaja {
    private ArrayList<Kortti> pelaajanPelaamatKortit;
    
    public Pelaaja() {
        this.pelaajanPelaamatKortit = new ArrayList<>();
    }
    
    public void lisaaKortti(Kortti pelaajanKortti) {
        this.pelaajanPelaamatKortit.add(pelaajanKortti);
    }
    
    public int getKorttienMaara() {
        
        int korttienMaara = 0;
        
        for (Kortti maara : this.pelaajanPelaamatKortit) {
            korttienMaara++;
        }
        
        return korttienMaara;
    }
    
    public int getKorttienSumma() {
        int korttienSumma = 0;
        
        for (Kortti pelaajanKortit : this.pelaajanPelaamatKortit) {
            korttienSumma += pelaajanKortit.getArvo();
        }
        
        return korttienSumma;
    }
    
    @Override
    public String toString() {
        return this.pelaajanPelaamatKortit.toString();
    }
}