package lt.filmai.filmuaplikacija.controller;

import lt.filmai.filmuaplikacija.model.entity.FilmoPavadinimas;
import lt.filmai.filmuaplikacija.model.entity.FilmuKategorija;
import lt.filmai.filmuaplikacija.model.repository.FilmoPavadinimasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FilmoPavadinimasController {

    @Autowired
    FilmoPavadinimasRepository filmoPavadinimasRepository;

    @GetMapping("/pagrindinis-puslapis/filmo-paieska")
    String testinisEndpoint() {
        return "šis puslapis veikia";
    }


    @GetMapping("/filmai/paieska")
    FilmoPavadinimas gautiPagalPavadinima(@RequestParam String pavadinimas) {
        return filmoPavadinimasRepository.findByFilmas(pavadinimas);
    }

    @GetMapping("/filmai/paieska_id")
    FilmoPavadinimas gautiPagalId1(@RequestParam long id) {
        return filmoPavadinimasRepository.findById(id);
    }

    @PostMapping("/filmai/ideti_filma")
    String idetiFilma(@RequestBody FilmoPavadinimas ivedamasFilmas) {
        filmoPavadinimasRepository.save(ivedamasFilmas);
        return "įdėjo";

    }
}
