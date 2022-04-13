package lt.filmai.filmuaplikacija.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FilmoPavadinimas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String filmas;
    @Column(length = 1000)
    private String aprasymas;
    private double ivertinimas;

    @ManyToOne
    @JoinColumn(name = "kategorija")
    private FilmuKategorija kategorija1;

    @JsonIgnore
    @OneToMany
            (mappedBy = "komentaroFilmas")
    Set<Komentaras> komentaras2;

    public FilmoPavadinimas() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilmas() {
        return filmas;
    }

    public void setFilmas(String filmas) {
        this.filmas = filmas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public double getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(double ivertinimas) {
        this.ivertinimas = ivertinimas;
    }

    public FilmuKategorija getKategorija1() {
        return kategorija1;
    }

    public void setKategorija1(FilmuKategorija kategorija1) {
        this.kategorija1 = kategorija1;
    }

    public Set<Komentaras> getKomentaras2() {
        return komentaras2;
    }

    public void setKomentaras2(Set<Komentaras> komentaras2) {
        this.komentaras2 = komentaras2;
    }

    @Override
    public String toString() {
        return "FilmoPavadinimas{" +
                "id=" + id +
                ", filmas='" + filmas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", ivertinimas=" + ivertinimas +
                ", kategorija1=" + kategorija1 +
                ", komentaras2=" + komentaras2 +
                '}';
    }

    public FilmoPavadinimas(long id, String filmas, String aprasymas, double ivertinimas, FilmuKategorija kategorija1, Set<Komentaras> komentaras2) {
        this.id = id;
        this.filmas = filmas;
        this.aprasymas = aprasymas;
        this.ivertinimas = ivertinimas;
        this.kategorija1 = kategorija1;
        this.komentaras2 = komentaras2;


    }
}