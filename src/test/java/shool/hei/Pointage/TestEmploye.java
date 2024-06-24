package shool.hei.Pointage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmploye {

    @Test
    public void testEmployeCreationGardien() {
        Categorie categorie = new Categorie("Gardien", 40, 100000, TypeCategorie.GARDIEN);
        Employe rakoto = new Employe("Rakoto", "Andriamalala", "RA001", LocalDate.of(1985, 6, 15), LocalDate.now(), LocalDate.of(2025, 6, 15), 100000, categorie);
        Employe rabe = new Employe("Rabe", "Raharisona", "RB002", LocalDate.of(1990, 7, 22), LocalDate.now(), LocalDate.of(2030, 7, 22), 100000, categorie);

        assertEquals("Rakoto Andriamalala", rakoto.getNom() + " " + rakoto.getPrenom());
        assertEquals("RA001", rakoto.getNumeroMatricule());
        assertEquals(LocalDate.of(1985, 6, 15), rakoto.getDateDeNaissance());
        assertEquals(LocalDate.now(), rakoto.getDateEmbauche());
        assertEquals(LocalDate.of(2025, 6, 15), rakoto.getDateFinContrat());
        assertEquals(100000, rakoto.getSalaireBrut(), 0.01);
        assertEquals(categorie, rakoto.getCategorie());

        assertEquals("Rabe Raharisona", rabe.getNom() + " " + rabe.getPrenom());
        assertEquals("RB002", rabe.getNumeroMatricule());
        assertEquals(LocalDate.of(1990, 7, 22), rabe.getDateDeNaissance());
        assertEquals(LocalDate.now(), rabe.getDateEmbauche());
        assertEquals(LocalDate.of(2030, 7, 22), rabe.getDateFinContrat());
        assertEquals(100000, rabe.getSalaireBrut(), 0.01);
        assertEquals(categorie, rabe.getCategorie());
    }

    @Test
    public void testAjoutPointageGardien() {
        Categorie categorie = new Categorie("Gardien", 40, 100000, TypeCategorie.GARDIEN);
        Employe rakoto = new Employe("Rakoto", "Andriamalala", "RA001", LocalDate.of(1985, 6, 15), LocalDate.now(), LocalDate.of(2025, 6, 15), 100000, categorie);
        Pointage pointage = new Pointage(rakoto, LocalDate.now(), 40, 0, 0, 40); // Added 'heuresNormalesParSemaine' parameter
        rakoto.ajouterPointage(pointage);
        assertTrue(rakoto.getPointages().contains(pointage));
    }

}
