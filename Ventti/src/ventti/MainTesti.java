
package ventti;

public class MainTesti {
    public static void main(String[] args) {
        
        //Emäntänä haluan että voitan tasatilanteessa//TOIMII
        TarkistaVoitto tasaPeli = new TarkistaVoitto(20, 20, 5);
        System.out.println("Tasapeli: " + tasaPeli.kumpiVoitti());
        
        //Tarkista: Emäntänä haluan että voitan myös jos oman käteni arvo on 20 vaikka pelaajalla olisi ventti//TOIMII
        TarkistaVoitto emanta20 = new TarkistaVoitto(20, 18, 5);
        System.out.println("Emäntä käsi 20, voittaa, vaikka pelaajalla olisi ventti: " + emanta20.kumpiVoitti());
        
        // Tarkista: Pelaajana haluan että käteni on ventti jos siinä on viisi korttia vaikka arvo on alle 21//TOIMII
        TarkistaVoitto pelaajaVentti = new TarkistaVoitto(19, 20, 5);
        System.out.println("Pelaaja voitti, koska ventti: " + pelaajaVentti.kumpiVoitti());
        
        //Tarkista: Emännän korttienSumma on suurempi kuin pelaajan, mutta pienempi kuin maksimi, joten emäntä voittaa//EI TOIMII!
        TarkistaVoitto emantaSuurempi = new TarkistaVoitto(18, 6, 1);
        System.out.println("Emäntä voitti, koska suurempi kuin pelaajan käsi: " + emantaSuurempi.kumpiVoitti());
        
        //Tarkista: Pelaajan korttienSumma on suurempi kuin emännän, mutta pienempi kuin maksimi//TOIMII
        TarkistaVoitto pelaajaSuurempi = new TarkistaVoitto(6, 18, 4);//Ei toimi
        System.out.println("Pelaaja voitti, koska suurempi kuin emännän käsi: " + pelaajaSuurempi.kumpiVoitti());
        //Tarkista: Molemmilla liian suuret
        TarkistaVoitto molemmatLiianSuuret = new TarkistaVoitto(23, 24, 6); //TOIMII
        System.out.println("Molemmilla liian suuret: " + molemmatLiianSuuret.kumpiVoitti());
        
    
    }
}
