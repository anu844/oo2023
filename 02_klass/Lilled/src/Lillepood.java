public class Lillepood {
    Lill lill;
    double hind;

    public Lillepood(Lill lill, double hind) {
        this.lill = lill;
        this.hind = hind;
    }

    public void ostaLill(Lill lill){
        this.lill = lill;

        System.out.println("Kas " + lill.sort + " on see lill, mida soovite osta?");
    }
    public void koguHind(double pael){
        this.hind = this.hind + pael;

        System.out.println("ühe " + lill.varv + " " + lill.sort + " ostmisel tuleb tasuda " + hind +" eurot.");
    }
}