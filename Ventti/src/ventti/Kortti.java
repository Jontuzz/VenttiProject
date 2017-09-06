
package ventti;

public class Kortti {
    private String maa;
    private int arvo;
    
    public Kortti(String maa, int arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }
    
    public String getMaa() {
        return this.maa;
    }
    
    public int getArvo() {
        return this.arvo;
    }
    
    public String toString() {
        return "Kortti: " + this.maa + ", " + this.arvo;
    }
}
