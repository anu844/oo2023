package ee.anu.autodeobjektid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OmanikController {

    @Autowired
    private OmanikRepository omanikRepository;

    @Autowired
    private AutoRepository autoRepository;

    @GetMapping("lisa-omanik")
    public List<Omanik> lisaOmanik(
            @RequestParam String nimi

    ){
        omanikRepository.save(new Omanik(nimi,new ArrayList<>()));
        return omanikRepository.findAll();
    }

    @GetMapping("lisa-omanikule-auto")
    public String lisaOmanikuleAuto(
            @RequestParam String nimi,
            @RequestParam Long id
    ){
        Omanik omanik = omanikRepository.findByNimi(nimi);
        Auto auto = autoRepository.findById(id).get();
        List<Auto> omanikuAutod=omanik.getAuto();
        omanikuAutod.add(auto);
        omanik.setAuto(omanikuAutod);
        omanikRepository.save(omanik);
        return "Auto omanikule lisatud!";
    }

    @GetMapping("saa-autod")
    public List<Auto> saaAutod(
            @RequestParam String nimi
    ){
        return omanikRepository.findByNimi(nimi).getAuto();
    }


}
