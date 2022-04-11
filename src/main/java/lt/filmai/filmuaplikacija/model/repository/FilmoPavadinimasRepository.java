package lt.filmai.filmuaplikacija.model.repository;

import lt.filmai.filmuaplikacija.model.entity.FilmoPavadinimas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface FilmoPavadinimasRepository extends JpaRepository<FilmoPavadinimas, Integer> {
    FilmoPavadinimas findByFilmas(String pavadinimas);



    }

