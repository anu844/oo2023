package ee.anu.autodeobjektid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutoController {
    @Autowired
    AutoRepository autoRepository;

    // localhost:8080/lisa-auto?id=1&pikkus=2.1&mass=2.2&mark=audi
    @GetMapping("lisa-auto")
    public List<Auto> lisaAuto(
            @RequestParam Long id,
            @RequestParam double pikkus,
            @RequestParam double mass,
            @RequestParam String mark
    ) {
        autoRepository.save(new Auto(id, pikkus, mass, mark));
        return autoRepository.findAll();
    }


    // localhost:8080/leia-pikkuse-alusel?alg=1&lopp=5
    @GetMapping("leia-pikkuse-alusel")
    public List<Auto> leiaPikkuseAlusel(
            @RequestParam double alg,
            @RequestParam double lopp
    ) {
        return autoRepository.findByPikkusIsBetween(alg, lopp);
    }

    // localhost:8080/leia-margi-alusel?mark=audi
    @GetMapping("leia-margi-alusel")
    public List<Auto> leiaMargiAlusel(
            @RequestParam String mark
    ) {
        List<Auto> autod = autoRepository.findAllByMark(mark);
        return autod;
    }

    // localhost:8080/leia-massi-alusel?alg=1&lopp=5
    @GetMapping("leia-massi-alusel")
    public List<Auto> leiaMassiAlusel(
            @RequestParam double alg,
            @RequestParam double lopp
    ) {
        return autoRepository.findByMassIsBetween(alg, lopp);
    }



}

