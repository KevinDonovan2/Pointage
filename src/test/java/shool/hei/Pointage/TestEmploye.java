package shool.hei.Pointage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmploye {

    @Test
    public void testEmployeCreation() {
        Categorie categorie = new Categorie("Gardien", 56, 110000);
        Employe employe = new Employe("Rakoto", "Andriamalala", "RA001", LocalDate.of(1985, 6, 15), LocalDate.now(), LocalDate.of(2025, 6, 15), 80000, categorie);

        assertEquals("Rakoto Andriamalala", employe.getNom() + " " + employe.getPrenom());
        assertEquals("RA001", employe.getNumeroMatricule());
        assertEquals(LocalDate.of(1985, 6, 15), employe.getDateDeNaissance());
        assertEquals(LocalDate.now(), employe.getDateEmbauche());
        assertEquals(LocalDate.of(2025, 6, 15), employe.getDateFinContrat());
        assertEquals(80000, employe.getSalaireBrut(), 0.01);
        assertEquals(categorie, employe.getCategorie());
    }

    @Test
    public void testAjoutPointage() {
        Categorie categorie = new Categorie("Gardien", 56, 110000);
        Employe employe = new Employe("Rakoto", "Andriamalala", "RA001", LocalDate.of(1985, 6, 15), LocalDate.now(), LocalDate.of(2025, 6, 15), 80000, categorie);
        Pointage pointage = new Pointage(employe, LocalDate.now(), 40, 8, 0); // 40h normales + 8h supplémentaires

        employe.ajouterPointage(pointage);

        assertTrue(employe.getPointages().contains(pointage));
    }
}
