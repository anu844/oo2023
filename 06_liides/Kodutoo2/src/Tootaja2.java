public class Tootaja2 extends Andmed implements Arvutamine{
    String nimi;
    double koormus;
    double tunniPalk;

    public Tootaja2(double uldisedTootunnidKuus, String nimi, double koormus, double tunniPalk) {
        super(uldisedTootunnidKuus);
        this.nimi = nimi;
        this.koormus = koormus;
        this.tunniPalk = tunniPalk;
    }

    @Override
    public double arvutaTootajaTootunnid() {
        return uldisedTootunnidKuus * koormus;
    }

    @Override
    public double arvutaKuupalk() {
        return ((uldisedTootunnidKuus * koormus) * tunniPalk) - (((uldisedTootunnidKuus * koormus) * tunniPalk) * 0.2);
    }
}
