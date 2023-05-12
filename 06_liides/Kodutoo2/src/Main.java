import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("TERVITUS!");
        System.out.println(" ");
        Tootaja1 T1 = new Tootaja1(152, "Maria", 0.5, 10 );
        System.out.println(T1.nimi + " on tööl " + T1.koormus + " koormusega ja peab see kuu töötama " + T1.arvutaTootajaTootunnid() + " tundi.");
        System.out.println("Tema kuupalk on " + df.format(T1.arvutaKuupalk()) + " eurot kätte.");
        System.out.println("-----");
        Tootaja2 T2 = new Tootaja2(152, "Mia", 0.75, 8.2);
        System.out.println(T2.nimi + " on tööl " + T2.koormus + " koormusega ja peab see kuu töötama " + T2.arvutaTootajaTootunnid() + " tundi.");
        System.out.println("Tema kuupalk on " + df.format(T2.arvutaKuupalk()) + " eurot kätte.");
        System.out.println("-----");
        Tootaja3 T3 = new Tootaja3(152, "Tiia", 1, 9.5);
        System.out.println(T3.nimi + " on tööl " + T3.koormus + " koormusega ja peab see kuu töötama " + T3.arvutaTootajaTootunnid() + " tundi.");
        System.out.println("Tema kuupalk on " + df.format(T3.arvutaKuupalk()) + " eurot kätte.");
    }
}