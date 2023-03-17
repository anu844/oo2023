import java.util.List;

public class Main {
    public static void main(String[] args) {
        Koostisosa koostisosa1 = new Koostisosa(1, "muna", 4, "tykki");
        Koostisosa koostisosa2 = new Koostisosa(2, "suhkur", 60, "grammi");
        Koostisosa koostisosa3 = new Koostisosa(3, "jahu", 200, "grammi");
        Koostisosa koostisosa4 = new Koostisosa(4, "piim", 5, "detsiliitrit");

        Valmistusjuhend valmistusjuhend = new Valmistusjuhend( 1,"Klopi munad suhkruga lahti, sega juurde jahu, piim ja sega ühtlaseks. Kuumuta suur pann, lisa sobiv kogus tainast* ja küpseta paar minutit keskmisel kuumusel, kuni pannkook on altpoolt kaunilt kuldne. Keera ringi ja küpseta ka teiselt poolt.");

        Retsept retsept = new Retsept(1, "pannkook", List<koostisosa1>, valmistusjuhend );

    }
}