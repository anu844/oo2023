package ee.anu.kodunetoo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class PostitusController {
    List<Postitus> postitused = new ArrayList<>(Arrays.asList(
            new Postitus (1, "Jalutuskäik", "Ilm oli väga ilus ja soe. Nägin erinevaid linde ja imelist päikeseloojangut", LocalDateTime.now()),
            new Postitus (2, "Restoranis", "See restoran oli Fantastiline! Nii ilus interjöör ja millised toidud, vau!", LocalDateTime.now()),
            new Postitus (3, "Muuseumis", "Pilet oli natuke kallis ja pidi pikalt mõtlema, kas osta. Ostsin ja see oli täiega oma hinda väärt!", LocalDateTime.now()),
            new Postitus (4, "PARADIIS", "Kas oled käinud Hiiumaal? Kui ei, siis MINE! See on maapealne paradiis!", LocalDateTime.now())
    ));
    @GetMapping("postitused")
    public List<Postitus> saaPostitus(){
        return postitused;
    }
    @DeleteMapping("kustuta-postitus/{index}")
    public String kustutaPostitus(@PathVariable int index){
        postitused.remove(index);
        return "Postitus kustutatud!";
    }
    @PostMapping("lisa-postitus")
    public List<Postitus> lisaPostitus(
            @RequestParam int id,
            @RequestParam String pealkiri,
            @RequestParam String sisu,
            @RequestParam LocalDateTime kell){
        postitused.add(new Postitus(id, pealkiri, sisu, kell));
        return postitused;
    }
}
