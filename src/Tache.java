public class Tache {
    private String description;
    private boolean estComplete;
    private Projet projet;

    public Tache(String description, Projet projet) {
        this.description = description;
        this.estComplete = false;
        this.projet = projet;
    }

    public String getDescription() {
        return description;
    }

    public boolean estComplete() {
        return estComplete;
    }

    public void completerTache() {
        this.estComplete = true;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    @Override
    public String toString() {
        return String.format("Tâche: %s\nComplétée: %s\nProjet: %s",
                description, estComplete ? "Oui" : "Non", projet.getNom());
    }
}
