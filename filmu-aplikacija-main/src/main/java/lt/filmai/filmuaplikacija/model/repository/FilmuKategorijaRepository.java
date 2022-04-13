package lt.filmai.filmuaplikacija.model.repository;

import lt.filmai.filmuaplikacija.model.entity.FilmuKategorija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface FilmuKategorijaRepository extends JpaRepository<FilmuKategorija, Long>{
    FilmuKategorija findByZanras(String zanras);
    FilmuKategorija findById(long id);
}