package ee.anu.kodunetoo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class KommentaarController {
    List<Kommentaar> kommentaarid = new ArrayList<>(Arrays.asList(
            new Kommentaar (1, "Väga ilus!", LocalDateTime.now()),
            new Kommentaar (2, "Suurepärane!", LocalDateTime.now()),
            new Kommentaar (3, "Veits imelik nagu..", LocalDateTime.now()),
            new Kommentaar (4, "Nõustun täiega! Paradiisisaar!", LocalDateTime.now())
    ));
    @GetMapping("kommentaar")
    public List<Kommentaar> saaKommentaar(){
        return kommentaarid;
    }
    @DeleteMapping("kustuta-kommentaar/{index}")
    public String kustutaKommentaar(@PathVariable int index){
        kommentaarid.remove(index);
        return "Kommentaar kustutatud!";
    }
    @PostMapping("lisa-Kommentaar")
    public List<Kommentaar> lisaKommentaar(
            @RequestParam int id,
            @RequestParam String sisu,
            @RequestParam LocalDateTime kell){
        kommentaarid.add(new Kommentaar(id, sisu, kell));
        return kommentaarid;
    }
}
