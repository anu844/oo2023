import java.util.Date;


public class Tootaja {
    String tootajaEesnimi;
    String tootajaPerenimi;
    boolean tootab;
    Date tooleAsumiseAeg;
    Date tooLopetamiseAeg;

    public Tootaja(String tootajaEesnimi, String tootajaPerenimi){
        this.tootajaEesnimi = tootajaEesnimi;
        this.tootajaPerenimi = tootajaPerenimi;
        this.tootab = true;
        this.tooleAsumiseAeg = new Date();
        this.tooLopetamiseAeg = null;
    }

    public String tooLopetamine(){
        this.tootab  = false;
        this.tooLopetamiseAeg = new Date();
        return "Tootaja tootamine lopetatud!";
    }

    public void asendus(String uusTootajaEesnimi, String uusTootajaPerenimi){
        this.tooleAsumiseAeg = new Date();
        this.tootajaEesnimi = uusTootajaEesnimi;
        this.tootajaPerenimi = uusTootajaPerenimi;

        System.out.println("Tootaja asendaja on "+tootajaEesnimi+" "+tootajaPerenimi +".");
    }


}
