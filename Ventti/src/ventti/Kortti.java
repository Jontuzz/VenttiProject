
package ventti;

public class Kortti {
    private String maa;
    private int arvo;
    
    public Kortti(String maa, int arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }
    
    //metodi kortin maan palauttamiseen
    public String getMaa() {
        return this.maa;
    }
    
    //metodi kortin arvon palauttamiseen
    public int getArvo() {
        return this.arvo;
    }
    
    public String toString() {
        return "Kortti: " + this.maa + ", " + this.arvo;
    }
}
