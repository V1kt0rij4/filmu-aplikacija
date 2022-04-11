package lt.filmai.filmuaplikacija.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FilmuKategorija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String zanras;

    @JsonIgnore
    @OneToMany(mappedBy = "kategorija1")
    Set<FilmoPavadinimas> kategorijosFilmai;

    public FilmuKategorija() {
    }

    public FilmuKategorija(long id, String zanras, Set<FilmoPavadinimas> kategorijosFilmai) {
        this.id = id;
        this.zanras = zanras;
        this.kategorijosFilmai = kategorijosFilmai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getZanras() {
        return zanras;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

    public Set<FilmoPavadinimas> getKategorijosFilmai() {
        return kategorijosFilmai;
    }

    public void setKategorijosFilmai(Set<FilmoPavadinimas> kategorijosFilmai) {
        this.kategorijosFilmai = kategorijosFilmai;
    }

    @Override
    public String toString() {
        return "FilmuKategorija{" +
                "id=" + id +
                ", zanras='" + zanras + '\'' +
                ", kategorijosFilmai=" + kategorijosFilmai +
                '}';
    }
}