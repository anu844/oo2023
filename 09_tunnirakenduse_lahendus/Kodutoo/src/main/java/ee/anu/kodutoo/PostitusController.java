package ee.anu.kodutoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class PostitusController {
    Postitus postitus = new Postitus (1, "Jalutuskäik", "Ilm oli väga ilus ja soe. Nägin erinevaid linde ja imelist päikeseloojangut", LocalDateTime.now());

    @GetMapping("postitus")
    public Postitus saaPostitus() {
        return postitus;
    }
    @GetMapping("kustuta-postitus")
    public String kustutaToode(){
        postitus = null;
        return "Postitus kustutatud!";
    }
    @GetMapping("muuda-pealkiri/{pealkiri}")
    public Postitus muudaPealkiri(@PathVariable String pealkiri){
        postitus.setPealkiri (pealkiri);
        return postitus;
    }
}
