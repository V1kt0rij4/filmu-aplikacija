package lt.filmai.filmuaplikacija.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
public class Vartotojas {

    @Id
    @GeneratedValue

    long id;
    String slaptazodis;
    String prisijungimas;

    @JsonIgnore
    @OneToMany(mappedBy = "komentaroKurejas")
    Set<Komentaras> komentaras1;

    public Vartotojas() {

    }

    public Vartotojas(long id, String slaptazodis, String prisijungimas, Set<Komentaras> komentaras1) {
        this.id = id;
        this.slaptazodis = slaptazodis;
        this.prisijungimas = prisijungimas;
        this.komentaras1 = komentaras1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSlaptazodis() {
        return slaptazodis;
    }

    public void setSlaptazodis(String slaptazodis) {
        this.slaptazodis = slaptazodis;
    }

    public String getPrisijungimas() {
        return prisijungimas;
    }

    public void setPrisijungimas(String prisijungimas) {
        this.prisijungimas = prisijungimas;
    }

    public Set<Komentaras> getKomentaras1() {
        return komentaras1;
    }

    public void setKomentaras1(Set<Komentaras> komentaras1) {
        this.komentaras1 = komentaras1;
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "id=" + id +
                ", slaptazodis='" + slaptazodis + '\'' +
                ", prisijungimas='" + prisijungimas + '\'' +
                ", komentaras1=" + komentaras1 +
                '}';
    }


}
