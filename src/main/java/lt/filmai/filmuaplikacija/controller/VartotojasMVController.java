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
    String testFilmai(Model model) {
        FilmoPavadinimas filmoPavadinimas = filmoPavadinimasRepository.findById(1);
        model.addAttribute("filmas", filmoPavadinimas.getFilmas());
        return "parodyti_filma.html";
    }
}
