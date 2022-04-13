package lt.filmai.filmuaplikacija.model.repository;

import lt.filmai.filmuaplikacija.model.entity.Komentaras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface KomentarasRepository extends JpaRepository<Komentaras, Long> {
    Komentaras findById(long id);
}
