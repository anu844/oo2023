public class Main {
    public static void main(String[] args) {
        System.out.println("Tere!");

        Tootaja anu = new Tootaja("Anu", "Sarapuu");
        Tootaja brenda = new Tootaja("Brenda", "Taime");
        Tootaja vilge = new Tootaja("Vilge", "Laht");

        String sonum = anu.tooLopetamine();
        System.out.println(sonum);

        brenda.asendus("Liisu", "Liit");

        Autod auto1 = new Autod("Audi", "BKO432", 2019);
        Autod auto2 = new Autod("BMW", "SRG938", 2012);

        auto1.lisaAutoKindlustus();
        auto2.kasOnKindlustus();
        System.out.println(auto1.);

    }



}