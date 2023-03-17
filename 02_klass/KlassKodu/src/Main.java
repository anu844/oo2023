import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       kasutaja mihkel = new kasutaja("mihkel", "mihkel", "mihkel", "mihkel", "mihkel");

       kasutaja mihkel2 = new kasutaja("mihkel", "mihkel", "mihkel", "mihkel", "mihkel");

       kasutaja mihkel3 = new kasutaja("mihkel", "mihkel", "mihkel", "mihkel", "mihkel");

       String sonum = mihkel.kustutaKasutaja();
        System.out.println(sonum);

        mihkel3.muudaParool("mihkelmihkel");


        Tellimus tellimus1 = new Tellimus("Mihkel", Arrays.asList("Coca", "Fanta"));
        Tellimus tellimus2 = new Tellimus("Mihkel", Arrays.asList("Coca", "Fanta"));
        Tellimus tellimus3 = new Tellimus("Mihkel", Arrays.asList("Coca", "Fanta"));

        tellimus1.muudaMakstuks();
        tellimus2.kasOnMakstud();
        System.out.println(tellimus2.kasOnMakstud());


        //KODUS: 1 klass, constructor, 2+ muutujat, 2+ funktsiooni 2+ väljakutset mainis
    }
}