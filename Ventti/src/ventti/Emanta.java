package ventti;

import java.util.ArrayList;

public class Emanta {
    private ArrayList<Kortti> emannanPelaamatKortit;
    
    public Emanta() {
        this.emannanPelaamatKortit = new ArrayList<>();
    }
    
    public void lisaaKortti(Kortti emannanKortti) {
        this.emannanPelaamatKortit.add(emannanKortti);
    }
    
    public int getKorttienMaara() {
        return this.emannanPelaamatKortit.size();
    }
    
    public int getKorttienSumma() {
        int korttienSumma = 0;
        
        for (Kortti pelaajanKortit : emannanPelaamatKortit) {
            korttienSumma += pelaajanKortit.getArvo();
        }
        
        return korttienSumma;
    }
    
    @Override
    public String toString() {
        return "Emännän korttipakka" + this.emannanPelaamatKortit;
    }
}
