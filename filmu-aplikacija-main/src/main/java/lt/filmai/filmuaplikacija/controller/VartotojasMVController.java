package lt.filmai.filmuaplikacija.controller;

import lt.filmai.filmuaplikacija.model.entity.FilmoPavadinimas;
import lt.filmai.filmuaplikacija.model.repository.FilmoPavadinimasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VartotojasMVController {
    @Autowired
    FilmoPavadinimasRepository filmoPavadinimasRepository;

    @GetMapping("/test/sveikinimas")
    String testineFunkcija(Model model, @RequestParam String vardas) {
        model.addAttribute("vardas", vardas);
        return "testinis_puslapis.html";
    }

    @GetMapping("/test/filmai")
    String testFilmai(Model model, @RequestParam String pavadinimas) {
        FilmoPavadinimas filmoPavadinimas = filmoPavadinimasRepository.findByFilmas(pavadinimas);
        model.addAttribute("filmas", filmoPavadinimas.getFilmas());
        model.addAttribute("aprasymas", filmoPavadinimas.getAprasymas());
        model.addAttribute("ivertinimas", filmoPavadinimas.getIvertinimas());
        model.addAttribute("filmuKategorija", filmoPavadinimas.getKategorija1());
        return "parodyti_filma.html";



    }
    @GetMapping("/test/fpaieska")
    String testPaieska(Model model) {
        return "rasti_filma.html";
    }

    @GetMapping("/filmas/idejimas")
    String filmoIdejimas(Model model) {
        return "ideti_filma.html";
    }
}
