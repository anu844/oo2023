import java.util.Date;

public class Autod {
    String automark;
    String autoNumber;
    int aasta;
    boolean kindlustus;
    Date arveleVotmiseAeg;
    Date arveltMahaAeg;

    public Autod(String automark, String autoNumber, int aasta){
        this.automark = automark;
        this.autoNumber = autoNumber;
        this.aasta = aasta;
        this.kindlustus = false;
        this.arveleVotmiseAeg = new Date();
        this.arveltMahaAeg = null;
    }
    public void lisaAutoKindlustus() {
        this.kindlustus = true;
    }

    public void kasOnKindlustus(){
        if(kindlustus){
            System.out.println("Kindlustus on olemas " + automark + "-l numbrimargiga " + autoNumber + ".");
        } else {
            System.out.println("Kindlustus puudub " + automark + "-l numbrimargiga " + autoNumber + ".");
        }
    }
}
