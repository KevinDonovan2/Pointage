package shool.hei.Pointage;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalendrierTravailTest {

    @Test
    void testGenererCalendrierJuinEmployeNormal() {
        List<JourCalendaire> calendrier = CalendrierTravail.genererCalendrierJuin(false); // false pour un employé normal

        // Vérifier que le calendrier contient bien 30 jours pour le mois de juin 2024
        assertEquals(30, calendrier.size());

        // Vérifier les jours fériés
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 17))));
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 25))));
        assertTrue(calendrier.stream().anyMatch(j -> j.getDate().equals(LocalDate.of(2024, 6, 26))));

        // Calcul des heures de travail
        int heuresJour = CalendrierTravail.calculerHeuresTravailJour(calendrier);
        int heuresNuit = CalendrierTravail.calculerHeuresTravailNuit(calendrier);

        // Vérifier les heures de travail
        assertEquals(136, heuresJour);
        assertEquals(0, heuresNuit);
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

        // Calcul des heures de travail
        int heuresJour = CalendrierTravail.calculerHeuresTravailJour(calendrier);
        int heuresNuit = CalendrierTravail.calculerHeuresTravailNuit(calendrier);

        // Vérifier les heures de travail
        assertEquals(216, heuresJour);
        assertEquals(216, heuresNuit);
    }

    @Test
    void testGenererCalendrierJuinSamediNonTravailableEmployeNormal() {
        List<JourCalendaire> calendrier = CalendrierTravail.genererCalendrierJuin(false); // false pour un employé normal

        assertFalse(calendrier.stream().anyMatch(j -> j.getDate().getDayOfWeek() == DayOfWeek.SATURDAY && j.isEstJourTravail()));
    }

    @Test
    void testGenererCalendrierJuinDimancheNonTravailableEmployeNormal() {
        List<JourCalendaire> calendrier = CalendrierTravail.genererCalendrierJuin(false); // false pour un employé normal

        assertFalse(calendrier.stream().anyMatch(j -> j.getDate().getDayOfWeek() == DayOfWeek.SUNDAY && j.isEstJourTravail()));
    }
}
