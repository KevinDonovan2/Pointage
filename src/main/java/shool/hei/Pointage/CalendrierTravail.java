package shool.hei.Pointage;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalendrierTravail {

    public static List<JourCalendaire> genererCalendrierJuin(boolean estGardien) {
        List<JourCalendaire> calendrier = new ArrayList<>();
        LocalDate debutMois = LocalDate.of(2024, 6, 1); // Ajustement pour juin 2024
        LocalDate finMois = debutMois.plusMonths(1).minusDays(1);

        DayOfWeek jourDebut = DayOfWeek.MONDAY;
        DayOfWeek jourFin = DayOfWeek.FRIDAY; // Pour les employés normaux
        if (estGardien) {
            jourFin = DayOfWeek.SUNDAY; // Pour les gardiens
        }

        for (LocalDate date = debutMois; date.isBefore(finMois.plusDays(1)); date = date.plusDays(1)) {
            boolean estJourFerie = false;
            boolean estJourTravail = true;

            // Vérifier si c'est un jour férié
            if (date.getDayOfMonth() == 17 || date.getDayOfMonth() == 25 || date.getDayOfMonth() == 26) {
                estJourFerie = true;
            } else {
                // Vérifier si c'est un jour de repos
                DayOfWeek jourCourant = date.getDayOfWeek();
                if (!jourDebut.equals(jourCourant) && !jourFin.equals(jourCourant)) {
                    estJourTravail = false;
                }
            }

            calendrier.add(new JourCalendaire(date, estJourFerie, estJourTravail));
        }

        return calendrier;
    }
}
