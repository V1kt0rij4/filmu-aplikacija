package lt.filmai.filmuaplikacija.controller;


import lt.filmai.filmuaplikacija.model.entity.FilmoPavadinimas;
import lt.filmai.filmuaplikacija.model.entity.Vartotojas;
import lt.filmai.filmuaplikacija.model.repository.VartotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VartotojasController {

    @Autowired
    VartotojasRepository vartotojasRepository;

    @GetMapping("/pagrindinis-puslapis/prisijungimas")
    String testinisEndpoint() {
        return "šis puslapis veikia";
    }

}