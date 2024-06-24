package shool.hei.Pointage;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalendrierTravail {

    public static List<JourCalendaire> genererCalendrierJuin(boolean estGardien) {
        List<JourCalendaire> calendrier = new ArrayList<>();
        LocalDate debutMois = LocalDate.of(2024, 6, 1);
        LocalDate finMois = debutMois.plusMonths(1).minusDays(1);

        for (LocalDate date = debutMois; date.isBefore(finMois.plusDays(1)); date = date.plusDays(1)) {
            boolean estJourFerie = false;
            boolean estJourTravail = true;

            // Vérifier si c'est un jour férié
            if (date.getDayOfMonth() == 17 || date.getDayOfMonth() == 25 || date.getDayOfMonth() == 26) {
                estJourFerie = true;
                estJourTravail = false; // Jour férié, donc pas de travail
            } else {
                // Vérifier si c'est un jour de repos (pour les employés normaux)
                DayOfWeek jourCourant = date.getDayOfWeek();
                if (!estGardien && (jourCourant == DayOfWeek.SATURDAY || jourCourant == DayOfWeek.SUNDAY)) {
                    estJourTravail = false;
                }
            }

            int heuresTravailJour = estJourTravail && !estJourFerie ? 8 : 0;
            int heuresTravailNuit = estGardien && estJourTravail && !estJourFerie ? 8 : 0;

            calendrier.add(new JourCalendaire(date, estJourFerie, estJourTravail, heuresTravailJour, heuresTravailNuit));
        }

        return calendrier;
    }

    public static int calculerHeuresTravailJour(List<JourCalendaire> calendrier) {
        return calendrier.stream().mapToInt(JourCalendaire::getHeuresTravailJour).sum();
    }

    public static int calculerHeuresTravailNuit(List<JourCalendaire> calendrier) {
        return calendrier.stream().mapToInt(JourCalendaire::getHeuresTravailNuit).sum();
    }
}
