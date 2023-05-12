import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    private Object assertEquals;

    @Test
    public void kontrolli_tootaja1_tootunnid(){
        Tootaja1 tootaja1 = new Tootaja1(152, "Liisa", 0.5, 9);
        assertEquals(76, tootaja1.arvutaTootajaTootunnid(), 0.0);
    }
    @Test
    public void kontrolli_tootaja1_kuupalk(){
        Tootaja1 tootaja1 = new Tootaja1(152, "Liisa", 0.5, 9);
        assertEquals(547.20, tootaja1.arvutaKuupalk(), 0.0);
    }
    @Test
    public void kontrolli_tootaja2_tootunnid(){
        Tootaja2 tootaja2 = new Tootaja2(152, "Laura", 0.75, 11);
        assertEquals(114, tootaja2.arvutaTootajaTootunnid(), 0.0);
    }
    @Test
    public void kontrolli_tootaja2_kuupalk(){
        Tootaja2 tootaja2 = new Tootaja2(152, "Laura", 0.75, 11);
        assertEquals(1003.20, tootaja2.arvutaKuupalk(), 0.0);
    }
    @Test
    public void kontrolli_tootaja3_tootunnid(){
        Tootaja3 tootaja3 = new Tootaja3(152, "Klaara", 1, 10.50);
        assertEquals(152, tootaja3.arvutaTootajaTootunnid(), 0.0);
    }
    @Test
    public void kontrolli_tootaja3_kuupalk(){
        Tootaja3 tootaja3 = new Tootaja3(152, "Klaara", 1, 10.50);
        assertEquals(1276.80, tootaja3.arvutaKuupalk(), 0.0);
    }
}
