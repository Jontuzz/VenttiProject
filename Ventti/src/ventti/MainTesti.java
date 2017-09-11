
package ventti;

public class MainTesti {
    public static void main(String[] args) {
        
        //Emäntänä haluan että voitan tasatilanteessa//TOIMII
        TarkistaVoitto tasaPeli = new TarkistaVoitto(20, 20, 6);
        System.out.println("Tasapeli: " + tasaPeli.kumpiVoitti());
        System.out.println("-------------------------------");
        //Tarkista: Emäntänä haluan että voitan myös jos oman käteni arvo on 20 vaikka pelaajalla olisi ventti//TOIMII
        TarkistaVoitto emanta20 = new TarkistaVoitto(20, 18, 5);
        System.out.println("Emäntä käsi 20, voittaa, vaikka pelaajalla olisi ventti: " + emanta20.kumpiVoitti());
        System.out.println("-------------------------------");
        // Tarkista: Pelaajana haluan että käteni on ventti jos siinä on viisi korttia vaikka arvo on alle 21//TOIMII
        TarkistaVoitto pelaajaVentti = new TarkistaVoitto(19, 20, 5);
        System.out.println("Pelaaja voitti, koska ventti: " + pelaajaVentti.kumpiVoitti());
        System.out.println("-------------------------------");
        //Tarkista: Emännän korttienSumma on lähempänä maksimia kuin pelaajan//TOIMII
        TarkistaVoitto emantaSuurempi = new TarkistaVoitto(18, 6, 1);
        System.out.println("Emäntä voitti, koska lähempänä maksimia kuin pelaajan käsi: " + emantaSuurempi.kumpiVoitti());
        System.out.println("-------------------------------");
        //Tarkista: Pelaajan korttienSumma on lähempänä maksimia kuin emännän//TOIMII
        TarkistaVoitto pelaajaSuurempi = new TarkistaVoitto(6, 18, 4);
        System.out.println("Pelaaja voitti, koska lähempänä maksimia kuin emännän käsi: " + pelaajaSuurempi.kumpiVoitti());
        System.out.println("-------------------------------");
        //Tarkista: Molemmilla liian suuret
        TarkistaVoitto molemmatLiianSuuret = new TarkistaVoitto(23, 24, 6); //TOIMII
        System.out.println("Molemmilla liian suuret: " + molemmatLiianSuuret.kumpiVoitti());
        
    
    }
}
