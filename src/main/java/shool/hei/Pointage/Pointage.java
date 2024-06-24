package shool.hei.Pointage;

import java.time.LocalDate;

public class Pointage {
    private Employe employe;
    private LocalDate date;
    private int heuresNormales;
    private int heuresSupplementaires;
    private int heuresMajorées;
    private int heuresNormalesParSemaine;

    public Pointage(Employe employe, LocalDate date, int heuresNormales, int heuresSupplementaires, int heuresMajorées, int heuresNormalesParSemaine) {
        this.employe = employe;
        this.date = date;
        this.heuresNormales = heuresNormales;
        this.heuresSupplementaires = heuresSupplementaires;
        this.heuresMajorées = heuresMajorées;
        this.heuresNormalesParSemaine = heuresNormalesParSemaine;
    }

    // Constructeur vide
    public Pointage() {}

    // Getters et setters
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHeuresNormales() {
        return heuresNormales;
    }

    public void setHeuresNormales(int heuresNormales) {
        this.heuresNormales = heuresNormales;
    }

    public int getHeuresSupplementaires() {
        return heuresSupplementaires;
    }

    public void setHeuresSupplementaires(int heuresSupplementaires) {
        this.heuresSupplementaires = heuresSupplementaires;
    }

    public int getHeuresMajorées() {
        return heuresMajorées;
    }

    public void setHeuresMajorées(int heuresMajorées) {
        this.heuresMajorées = heuresMajorées;
    }

    public int getHeuresNormalesParSemaine() {
        return heuresNormalesParSemaine;
    }

    public void setHeuresNormalesParSemaine(int heuresNormalesParSemaine) {
        this.heuresNormalesParSemaine = heuresNormalesParSemaine;
    }

    public void calculerHeuresSupplementairesEtMajorées() {
        int totalHeuresTravaillées = heuresNormales + heuresSupplementaires + heuresMajorées;
        int heuresNormalesEffectuées = Math.min(totalHeuresTravaillées, heuresNormalesParSemaine);
        int heuresSupplementairesCalculables = Math.max(0, totalHeuresTravaillées - heuresNormalesEffectuées);

        if (heuresSupplementairesCalculables > 20) {
            heuresSupplementairesCalculables = 20;
        }
        if (heuresSupplementairesCalculables >= 8) {
            heuresSupplementairesCalculables -= 8;
            heuresSupplementaires += 8 * 1.3;
        }
        if (heuresSupplementairesCalculables >= 12) {
            heuresSupplementaires += 12 * 1.5;
            heuresSupplementairesCalculables -= 12;
        }

        if (heuresMajorées > 0) {
            heuresMajorées *= 1.3;
        }

        heuresNormales = heuresNormalesEffectuées;
        heuresSupplementaires = heuresSupplementairesCalculables;
        heuresMajorées = heuresMajorées;
    }
}
