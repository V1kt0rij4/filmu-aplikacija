package lt.filmai.filmuaplikacija.controller;

import lt.filmai.filmuaplikacija.model.entity.Komentaras;
import lt.filmai.filmuaplikacija.model.repository.KomentarasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class KomentarasController {

    @Autowired
    KomentarasRepository komentarasRepository;

    @GetMapping("/aprasymas/komentaras")
    String testinisEndpoint() {
        return "šis puslapis veikia";
    }

}
