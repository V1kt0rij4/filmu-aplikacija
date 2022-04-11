package lt.filmai.filmuaplikacija.model.entity;


    import javax.persistence.*;

@Entity
public class Komentaras {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private long id;
        private String tekstas;

        @ManyToOne
        @JoinColumn(name = "vartotojas")
        private Vartotojas komentaroKurejas;

        @ManyToOne
        @JoinColumn(name= "filmo_id")
        private FilmoPavadinimas komentaroFilmas;


        public Komentaras() {

        }

        public Komentaras(long id, String tekstas, Vartotojas komentaroKurejas, FilmoPavadinimas komentaroFilmas) {
                this.id = id;
                this.tekstas = tekstas;
                this.komentaroKurejas = komentaroKurejas;
                this.komentaroFilmas = komentaroFilmas;
        }


        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getTekstas() {
                return tekstas;
        }

        public void setTekstas(String tekstas) {
                this.tekstas = tekstas;
        }

        public Vartotojas getKomentaroKurejas() {
                return komentaroKurejas;
        }

        public void setKomentaroKurejas(Vartotojas komentaroKurejas) {
                this.komentaroKurejas = komentaroKurejas;
        }

        public FilmoPavadinimas getKomentaroFilmas() {
                return komentaroFilmas;
        }

        public void setKomentaroFilmas(FilmoPavadinimas komentaroFilmas) {
                this.komentaroFilmas = komentaroFilmas;
        }

        @Override
        public String toString() {
                return "Komentaras{" +
                        "id=" + id +
                        ", tekstas='" + tekstas + '\'' +
                        ", komentaroKurejas=" + komentaroKurejas +
                        ", komentaroFilmas=" + komentaroFilmas +
                        '}';
        }




}
