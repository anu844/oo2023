import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    // @Test -> alt+enter       add "JUnit4" to classpath -> OK
    @Test
    public void kontrolli_kolmnurga_ymbermoot(){
        Kolmnurk kolmnurk = new Kolmnurk(3, 6, 7, 8);
        assertEquals(21.0, kolmnurk.arvutaYmberMoot(), 0.0); // alt + enter ----> Assert.assertEquals()

    }
}

// Vähemalt 6 testi
// 2 arvutust + 3 kujundit = 6 testi


// faile ei tohi olla kokku alla 7
