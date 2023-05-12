package ee.anu.kodunetoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BlogiController {
    @Autowired
    PostitusController postitusController;
    @Autowired
    KommentaarController kommentaarController;
    List<Postitus> blogi1Postitused = new ArrayList<>(Arrays.asList(
            new Postitus (1, "Jalutuskäik", "Ilm oli väga ilus ja soe. Nägin erinevaid linde ja imelist päikeseloojangut", LocalDateTime.now()),
            new Postitus (4, "PARADIIS", "Kas oled käinud Hiiumaal? Kui ei, siis MINE! See on maapealne paradiis!", LocalDateTime.now())
    ));
    List<Postitus> blogi2Postitused = new ArrayList<>(Arrays.asList(
            new Postitus (3, "Muuseumis", "Pilet oli natuke kallis ja pidi pikalt mõtlema, kas osta. Ostsin ja see oli täiega oma hinda väärt!", LocalDateTime.now()),
            new Postitus (4, "PARADIIS", "Kas oled käinud Hiiumaal? Kui ei, siis MINE! See on maapealne paradiis!", LocalDateTime.now())
    ));
    List<Kommentaar> blogi1Kommentaarid = new ArrayList<>(Arrays.asList(
            new Kommentaar (1, "Väga ilus!", LocalDateTime.now()),
            new Kommentaar (4, "Nõustun täiega! Paradiisisaar!", LocalDateTime.now())
    ));
    List<Kommentaar> blogi2Kommentaarid = new ArrayList<>(Arrays.asList(
            new Kommentaar (3, "Veits imelik nagu..", LocalDateTime.now()),
            new Kommentaar (4, "Nõustun täiega! Paradiisisaar!", LocalDateTime.now())
    ));
    List<Blogi> blogid = new ArrayList<>(Arrays.asList(
            new Blogi(1, blogi1Postitused, blogi1Kommentaarid),
            new Blogi(2, blogi2Postitused, blogi2Kommentaarid)
    ));
// GET localhost:8080/blogid
    @GetMapping("blogid")
    public List<Blogi> saaBlogid(){
        return blogid;
    }
    // DELETE localhost:8080/kustuta-blogi/1
    @DeleteMapping("kustuta-blogi/{index}")
    public String kustutaBlogi(@PathVariable int index){
        blogid.remove(index);
        return "Blogi kustutatud!";
    }
    // POST localhost:8080/lisa-blogi?id=1&postituseIndex=1,2&kommentaariIndex=1,2
    @PostMapping("lisa-blogi")
    public List<Blogi> lisaBlogi(
            @RequestParam int id,
            @RequestParam int[] postituseIndex,
            @RequestParam int[] kommentaariIndex){
        List<Postitus> postitused = new ArrayList<>();
        for (int i: postituseIndex){
            Postitus postitus = postitusController.postitused.get(i);
            postitused.add(postitus);
        }
        List<Kommentaar> kommentaarid = new ArrayList<>();
        for (int i: kommentaariIndex){
            Kommentaar kommentaar = kommentaarController.kommentaarid.get(i);
            kommentaarid.add(kommentaar);
        }

     blogid.add(new Blogi(id, postitused, kommentaarid));
     return blogid;
    }
}
