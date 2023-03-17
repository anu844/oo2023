public class Main {
    public static void main(String[] args) {
        System.out.println("Kodused ulesanded!");
        System.out.println("Esimene: Lammaste loendamine.");

        tsykkel(1);

        System.out.println("");
        System.out.println("Teine: Pilvede k6rgus.");

        String korgus = pilvedeKorgus(8);
        String korgus2 = pilvedeKorgus(4);
        System.out.println(korgus);
        System.out.println(korgus2);

        System.out.println("");
        System.out.println("Kolmas: Palga arvutamine.");

        double palk = palgaArvutamine(156);
        System.out.println("Kuu palk on " + palk + " eurot.");

    }

    private static double palgaArvutamine(double tunnid) {
        return 5 * tunnid - (5*tunnid*0.20);
    }

    private static String pilvedeKorgus(int meetrid) {
        if ( meetrid < 6){
            return "Pilvede k6rgus on " + meetrid + " meetrit, need ei ole ulemised pilved.";
        } else {
            return "Pilvede k6rgus on " + meetrid + " meetrit, need on ulemised pilved.";
        }
    }

    private static void tsykkel(int korda) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ". Lammas");
        }
    }

}