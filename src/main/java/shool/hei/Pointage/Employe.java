package shool.hei.Pointage;

import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String nom;
    private String prenom;
    private String numeroMatricule;
    private LocalDate dateDeNaissance;
    private LocalDate dateEmbauche;
    private LocalDate dateFinContrat;
    private double salaireBrut;
    private Categorie categorie;
    private final List<Pointage> pointages;

    public Employe(String nom, String prenom, String numeroMatricule, LocalDate dateDeNaissance, LocalDate dateEmbauche, LocalDate dateFinContrat, double salaireBrut, Categorie categorie) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroMatricule = numeroMatricule;
        this.dateDeNaissance = dateDeNaissance;
        this.dateEmbauche = dateEmbauche;
        this.dateFinContrat = dateFinContrat;
        this.salaireBrut = salaireBrut;
        this.categorie = categorie;
        this.pointages = new ArrayList<>();
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroMatricule() {
        return numeroMatricule;
    }

    public void setNumeroMatricule(String numeroMatricule) {
        this.numeroMatricule = numeroMatricule;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    public void ajouterPointage(Pointage pointage) {
        this.pointages.add(pointage);
    }
}
