
package ventti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Korttipakka {
    
    //luodaan ArrayList maita varten
    private ArrayList<String> maat = new ArrayList<>();
    
    //ArrayList korttipakan korttejavarten
    private ArrayList<Kortti> korttiPakka = new ArrayList<>();
    
    public Korttipakka() {
        //lisätään tunnetut korttien maat ArrayListiin
        maat.add("Pata");
        maat.add("Ruutu");
        maat.add("Risti");
        maat.add("Hertta");
        
        //suoritetaan niin monta kertaa kuin maita on (eli 4 kertaa)
        //loopataan siten, että jokaiselle maalle tulee arvot 2-14
        for (int maidenLKM = 0; maidenLKM < 4; maidenLKM++) {
            //loopataan korttien arvot (arvot alkaa 2 ja loppuu ässään eli 14)
            for (int kortinArvo = 2; kortinArvo <= 14; kortinArvo++) {
                //luodaan kortti olio ja lisätään kortti olio ArrayListiin(yksi kerrallaan)
                korttiPakka.add(new Kortti(maat.get(maidenLKM), kortinArvo));
            }
        }
    }
    
    //muutetaan ArrayList tulostus muotoon
    public String toString() {
        return "Korttipakassa on kortit: " + korttiPakka;
    }
}
