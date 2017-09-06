
package ventti;

import java.util.ArrayList;

public class Korttipakka {
    
    //luodaan ArrayList maita varten
    private ArrayList<String> korttienMaat = new ArrayList<>();
    
    //ArrayList korttipakan korttejavarten
    private ArrayList<Kortti> korttiPakka = new ArrayList<>();
    
    public Korttipakka() {
        //lisätään tunnetut korttien maat ArrayListiin
        korttienMaat.add("Pata");
        korttienMaat.add("Ruutu");
        korttienMaat.add("Risti");
        korttienMaat.add("Hertta");
        
        //suoritetaan niin monta kertaa kuin maita on (eli 4 kertaa)
        for (int maanIndeksi = 0; maanIndeksi < 4; maanIndeksi++) {
            //loopataan siten, että jokaiselle maalle tulee arvot 2-14
            //arvot alkavat 2 ja loppuvat ässään eli 14
            for (int kortinArvo = 2; kortinArvo <= 14; kortinArvo++) {
                //luodaan kortti olio ja lisätään kortti olion viittaus ArrayListiin (yksi kerrallaan)
                korttiPakka.add(new Kortti(korttienMaat.get(maanIndeksi), kortinArvo));
            }
        }
    }
    
    //muutetaan ArrayList tulostus muotoon
    //tällä metodilla voidaan tulostaa ArrayList
    public String toString() {
        return "Korttipakassa on kortit: " + korttiPakka;
    }
}
