package lt.filmai.filmuaplikacija.controller;

import lt.filmai.filmuaplikacija.model.entity.FilmuKategorija;
import lt.filmai.filmuaplikacija.model.repository.FilmuKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FilmuKategorijaController {

    @Autowired
    FilmuKategorijaRepository filmuKategorijaRepository;

    @GetMapping("/aprasymas/filmo-informacija")
    String testinisEndpoint() {
        return "šis puslapis veikia";
    }

    @PostMapping("/filmai/ideti_kategorija")
    String idetiKategorija(@RequestBody FilmuKategorija ivedamaKategorija) {
        filmuKategorijaRepository.save(ivedamaKategorija);
        return "įdėjo";

    }

}
