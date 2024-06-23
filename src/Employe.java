public class Employe extends PersonneAbstraite {
    private Projet projet;

    public Employe(String nom, String role, double salaire, Projet projet) {
        super(nom, role, salaire);
        this.projet = projet;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    @Override
    public String toString() {
        return String.format("Employé: %s\nRôle: %s\nSalaire: %.2f\nProjet: %s",
                nom, role, salaire, projet.getNom());
    }
}
