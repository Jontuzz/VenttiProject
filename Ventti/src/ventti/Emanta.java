package ventti;

import java.util.ArrayList;

public class Emanta {
    private ArrayList<Kortti> emannanPelaamatKortit;
    
    public Emanta() {
        this.emannanPelaamatKortit = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return "Emännän korttipakka" + this.emannanPelaamatKortit;
    }
    
    public void lisaaKorttiEmanalle(Kortti emannanKortti) {
        this.emannanPelaamatKortit.add(emannanKortti);
    }
    
    public int getEmannanKorttienMaara() {
        return this.emannanPelaamatKortit.size();
    }
    
    public int getEmannanKorttienSumma() {
        int korttienSumma = 0;
        
        for (Kortti pelaajanKortit : emannanPelaamatKortit) {
            korttienSumma += pelaajanKortit.getArvo();
        }
        
        return korttienSumma;
    }
}
