package ventti;

import java.util.ArrayList;

public class Emanta {
    private ArrayList<Kortti> emannanPelaamatKortit;
    
    public Emanta() {
        this.emannanPelaamatKortit = new ArrayList<>();
    }
    
    public void lisaaKorttiEmanalle(Kortti emannanKortti) {
        this.emannanPelaamatKortit.add(emannanKortti);
    }
    
    public int getEmannanKorttienSumma() {
        int korttienSumma = 0;
        
        for (Kortti pelaajanKortit : emannanPelaamatKortit) {
            korttienSumma += pelaajanKortit.getArvo();
        }
        
        return korttienSumma;
    }
    
    public String toString() {
        return "Emännän korttipakka" + this.emannanPelaamatKortit;
    }
}
