import java.util.List;
public class Retsept {
    int id;
    String nimi;
    List<Koostisosa> koostisosa;
    Valmistusjuhend valmistusjuhend;

    public Retsept(int id, String nimi, List<Koostisosa> koostisosa, Valmistusjuhend valmistusjuhend) {
        this.id = id;
        this.nimi = nimi;
        this.koostisosa = koostisosa;
        this.valmistusjuhend = valmistusjuhend;
    }

}
