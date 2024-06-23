import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private String emplacement;
    private double budget;
    private List<Employe> employes;
    private List<Tache> taches;

    public Projet(String nom, String emplacement, double budget) {
        this.nom = nom;
        this.emplacement = emplacement;
        this.budget = budget;
        this.employes = new ArrayList<>();
        this.taches = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public double getBudget() {
        return budget;
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    @Override
    public String toString() {
        return String.format("Projet: %s\nEmplacement: %s\nBudget: %.2f\nEmployés: %d\nTâches: %d",
                nom, emplacement, budget, employes.size(), taches.size());
    }
}
