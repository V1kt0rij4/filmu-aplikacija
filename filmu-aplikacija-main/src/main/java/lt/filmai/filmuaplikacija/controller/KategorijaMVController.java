package lt.filmai.filmuaplikacija.controller;

import lt.filmai.filmuaplikacija.model.entity.FilmuKategorija;
import lt.filmai.filmuaplikacija.model.repository.FilmuKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
    public class KategorijaMVController {
    @Autowired
    FilmuKategorijaRepository filmuKategorijaRepository;

    @GetMapping("/test/visos_kategorijos")
    String rodytiVisasKategorijas(Model model) {
        List<FilmuKategorija> visosKategorijos = filmuKategorijaRepository.findAll();
        model.addAttribute("visosKategorijos", visosKategorijos);
        return "visos_kategorijos.html";
    }

    @GetMapping("/kategorija/rodyti_filmus")
    String rodytiKategorijosFilmus(Model model, @RequestParam long id) {
        FilmuKategorija filmuKategorija = filmuKategorijaRepository.findById(id);
        System.out.println("filmuKategorija = " + filmuKategorija);
        model.addAttribute("kategorijosFilmai", filmuKategorija.getKategorijosFilmai());
        model.addAttribute("kategorijosPavadinimas", filmuKategorija.getZanras());
        //System.out.println(filmuKategorija.getKategorijosFilmai());
        return "kategorijos_filmai.html";
    }

    @GetMapping("/testinis/mvc/kategorijoss_filmai")
    String rodytiVisusKategorijusFilmus(Model model, @RequestParam long id) {
        FilmuKategorija filmuKategorija = filmuKategorijaRepository.findById(id);
        model.addAttribute("kategorijosFilmai", filmuKategorija.getKategorijosFilmai());
        model.addAttribute("kategorijosPavadinimas", filmuKategorija.getZanras());
        return "kategorijos_filmai.html";
    }

    @GetMapping("/kategorija/kategorijos_idejimas")
    String kategorijosPridejimas(Model model) {
        return "ideti_kategorija.html";
    }

    @PostMapping("/kategorija/ideta_kategorija")
    String idetiKategorija(@RequestParam String pavadinimas) {
        FilmuKategorija naujaKategorija = new FilmuKategorija();
        naujaKategorija.setZanras(pavadinimas);
        filmuKategorijaRepository.save(naujaKategorija);
        return "ideta_kategorija.html";
    }

}
