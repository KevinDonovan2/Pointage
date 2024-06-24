package shool.hei.Pointage;

public class Categorie {
    private String nom;
    private int heuresNormalesParSemaine;
    private double salaireNormalParSemaine;
    private TypeCategorie type;

    public Categorie(String nom, int heuresNormalesParSemaine, double salaireNormalParSemaine, TypeCategorie type) {
        this.nom = nom;
        this.heuresNormalesParSemaine = heuresNormalesParSemaine;
        this.salaireNormalParSemaine = salaireNormalParSemaine;
        this.type = type;
    }

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

    public TypeCategorie getType() {
        return type;
    }

    public void setType(TypeCategorie type) {
        this.type = type;
    }

    public double calculerSalaireNet(double salaireBrut) {
        if (type == TypeCategorie.CADRE_SUP) {
            return salaireBrut;
        } else {
            return salaireBrut - (salaireBrut * 0.20);
        }
    }
}