package shool.hei.Pointage;

public class Categorie {
    private String nom;
    private int heuresNormalesParSemaine;
    private double salaireNormalParSemaine;

    public Categorie(String nom, int heuresNormalesParSemaine, double salaireNormalParSemaine) {
        this.nom = nom;
        this.heuresNormalesParSemaine = heuresNormalesParSemaine;
        this.salaireNormalParSemaine = salaireNormalParSemaine;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHeuresNormalesParSemaine() {
        return heuresNormalesParSemaine;
    }

    public void setHeuresNormalesParSemaine(int heuresNormalesParSemaine) {
        this.heuresNormalesParSemaine = heuresNormalesParSemaine;
    }

    public double getSalaireNormalParSemaine() {
        return salaireNormalParSemaine;
    }

    public void setSalaireNormalParSemaine(double salaireNormalParSemaine) {
        this.salaireNormalParSemaine = salaireNormalParSemaine;
    }
}
