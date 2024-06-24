package shool.hei.Pointage;

import java.time.LocalDate;

public class JourCalendaire {
    private LocalDate date;
    private boolean estJourFerie;
    private boolean estJourTravail;

    public JourCalendaire(LocalDate date, boolean estJourFerie, boolean estJourTravail) {
        this.date = date;
        this.estJourFerie = estJourFerie;
        this.estJourTravail = estJourTravail;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isEstJourFerie() {
        return estJourFerie;
    }

    public boolean isEstJourTravail() {
        return estJourTravail;
    }
}
