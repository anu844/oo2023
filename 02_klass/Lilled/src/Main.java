public class Main {
    public static void main(String[] args) {
        System.out.println("Tere tulemast lillepoodi! Kuidas saan aidata?");

        Lill lill = new Lill("gerbera", "roosa");
        Lillepood hind = new Lillepood(lill,3);

        Lill lill1 = new Lill("liilia","valge");
        Lillepood hind1 = new Lillepood(lill1,5);

        System.out.println("Soovin ühe " + lill.varv + " " + lill.sort + " osta.");
        hind.koguHind(0.5);
        System.out.println();




    }


}