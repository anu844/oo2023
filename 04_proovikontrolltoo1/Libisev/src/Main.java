import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proovikontrolltoo!");
        System.out.println(aritmKeskmine(3, 4, 5));
        System.out.println(aritmKeskmine(5, 5, 6));


        double[] sisend = {3, 4, 5, 6};
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));

        LibisevKeskmine libisev = new LibisevKeskmine(2,3,4);
        libisev.lisaArv(4);
        System.out.println(libisev.arvudKeskmisega);
        libisev.lisaArv(5);
        libisev.lisaArv(5);
        System.out.println(libisev.arvudKeskmisega);
    }



//Koosta funktsioon kolme arvu aritmeetilise keskmise leidmiseks. Katseta.
    private static double aritmKeskmine(double arv1, double arv2, double arv3){
        return (arv1 + arv2 + arv3) / 3;
    }

    //Koosta funktsioon massiivi libiseva keskmise leidmiseks. Väljundiks on massiiv,
    // mis on sisendist kahe elemendi võrra lühem ning mille iga elemendi väärtuseks on
    // sisendmassiivi vastava elemendi ning selle järgmise ja ülejärgmise elemendi keskmine.

    private static double[] libisevKeskmine(double[] arvud){
        double[] valjund = new double[arvud.length-2]; //kui teen uue array, peab koheselt ütlema, kui pikk ta on
        for (int i = 0; i < arvud.length-2; i++) { // fori + enter <- lühend
            valjund[i] = (arvud [i] + arvud[i+1] + arvud[i+2]) / 3;
        }
        return valjund;
    }

    // Koosta klass, mille eksemplarile saab vastava käsuga lisada arve. Teise käsuga saab küsida
    // nende arvude libiseva keskmise massiivi vastavalt eelmise punkti juhendile. Koosta kood
    // nõnda, et uue arvu lisamisel eksemplarile tehtaks uusi arvutusi võimalikult vähe (st. ei
    // arvutataks kogu tulemust massiivi algusest uuesti)
}