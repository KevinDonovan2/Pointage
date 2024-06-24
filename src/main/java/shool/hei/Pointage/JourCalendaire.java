package shool.hei.Pointage;

import java.time.LocalDate;

public class JourCalendaire {
    private LocalDate date;
    private boolean estJourFerie;
    private boolean estJourTravail;
    private int heuresTravailJour;
    private int heuresTravailNuit;

    public JourCalendaire(LocalDate date, boolean estJourFerie, boolean estJourTravail, int heuresTravailJour, int heuresTravailNuit) {
        this.date = date;
        this.estJourFerie = estJourFerie;
        this.estJourTravail = estJourTravail;
        this.heuresTravailJour = heuresTravailJour;
        this.heuresTravailNuit = heuresTravailNuit;
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

    public int getHeuresTravailJour() {
        return heuresTravailJour;
    }

    public int getHeuresTravailNuit() {
        return heuresTravailNuit;
    }
}
