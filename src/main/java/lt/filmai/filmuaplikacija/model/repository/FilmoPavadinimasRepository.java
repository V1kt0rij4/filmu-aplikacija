package lt.filmai.filmuaplikacija.model.repository;

import lt.filmai.filmuaplikacija.model.entity.FilmoPavadinimas;
import lt.filmai.filmuaplikacija.model.entity.Komentaras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository


public interface FilmoPavadinimasRepository extends JpaRepository<FilmoPavadinimas, Long> {
    FilmoPavadinimas findByFilmas(String pavadinimas);
    FilmoPavadinimas findById(long id);



    }

