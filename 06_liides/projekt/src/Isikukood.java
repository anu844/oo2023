public class Isikukood {
    String nimi;
    String isikukood;
    public Isikukood(String nimi, String isikukood){
        this.nimi = nimi;
        this.isikukood = isikukood;
    }

    public String getIsikukoodJaNimi(){
        return "Isikukood on: " +  this.isikukood + " | Nimi on: " + this.nimi;
    }


}
