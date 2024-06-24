package shool.hei.Pointage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalendrierTravailTest {

    @Test
    void testGenererCalendrierJuinEmployeNormal() {
        List<JourCalendaire> calendrier = CalendrierTravail.genererCalendrierJuin(false); // false pour un employé normal

        // Vérifier que le calendrier contient bien 30 jours pour le mois de juin 2024
        assertEquals(30, calendrier.size());

        // Vérifier les jours fériés
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 17))));
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 25))));
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 26))));

        // Vérifier les jours de travail pour un employé normal
        assertFalse(calendrier.stream().allMatch(j ->j.isEstJourTravail()));
    }

    @Test
    void testGenererCalendrierJuinGardien() {
        List<JourCalendaire> calendrier = CalendrierTravail.genererCalendrierJuin(true); // true pour un gardien

        // Vérifier que le calendrier contient bien 30 jours pour le mois de juin 2024
        assertEquals(30, calendrier.size());

        // Vérifier les jours fériés
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 17))));
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 25))));
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 26))));

        // Vérifier les jours de travail pour un gardien
        assertFalse(calendrier.stream().allMatch(j ->j.isEstJourTravail()));
    }

    @Test
    void testGenererCalendrierJuinSamediNonTravailableEmployeNormal() {
        List<JourCalendaire> calendrier = CalendrierTravail.genererCalendrierJuin(false); // false pour un employé normal

        assertFalse(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 9)) && j.isEstJourTravail()));
    }
}
