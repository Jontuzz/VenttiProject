
package ventti;

public class MainTesti {
    public static void main(String[] args) {
        
        //Emäntänä haluan että voitan tasatilanteessa
        TarkistaVoitto tasaPeli = new TarkistaVoitto(20, 20, 5);
        System.out.println("Tasapeli: " + tasaPeli.kumpiVoitti());
        
        //Tarkista: Emäntänä haluan että voitan myös jos oman käteni arvo on 20 vaikka pelaajalla olisi ventti
        TarkistaVoitto emanta20 = new TarkistaVoitto(20, 18, 5);
        System.out.println("Emäntä käsi 20, voittaa, vaikka pelaajalla olisi ventti: " + emanta20.kumpiVoitti());
        
        // Tarkista: Pelaajana haluan että käteni on ventti jos siinä on viisi korttia vaikka arvo on alle 21
        TarkistaVoitto pelaajaVentti = new TarkistaVoitto(19, 20, 5);
        System.out.println("Pelaaja voitti, koska ventti: " + pelaajaVentti.kumpiVoitti());
        
        //Tarkista: Emännän korttienSumma on suurempi kuin pelaajan, mutta pienempi kuin maksimi, joten emäntä voittaa
        TarkistaVoitto emantaSuurempi = new TarkistaVoitto(18, 6, 1);
        System.out.println("Emäntä voitti, koska suurempi kuin pelaajan käsi: " + pelaajaVentti.kumpiVoitti());
        
        //Tarkista: Pelaajan korttienSumma on suurempi kuin emännän, mutta pienempi kuin maksimi
        TarkistaVoitto pelaajaSuurempi = new TarkistaVoitto(13, 20, 4);//Ei toimi
        System.out.println("Pelaaja voitti, koska suurempi kuin pelaajan käsi: " + pelaajaSuurempi);
        //Tarkista: Molemmilla liian suuret
        TarkistaVoitto molemmatLiianSuuret = new TarkistaVoitto(23, 24, 6); //Ei toimi
        System.out.println("Molemmilla liian suuret: " + molemmatLiianSuuret);
        
    
    }
}
