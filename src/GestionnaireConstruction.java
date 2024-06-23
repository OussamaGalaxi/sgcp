import java.util.ArrayList;
import java.util.List;

public class GestionnaireConstruction {
    private List<Projet> projets;
    private List<Employe> employes;
    private List<Tache> taches;

    public GestionnaireConstruction() {
        this.projets = new ArrayList<>();
        this.employes = new ArrayList<>();
        this.taches = new ArrayList<>();
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public void ajouterProjet(Projet projet) {
        projets.add(projet);
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
        employe.getProjet().ajouterEmploye(employe);
    }

    public void ajouterTache(Tache tache) {
        taches.add(tache);
        tache.getProjet().ajouterTache(tache);
    }

    public void listerProjets() {
        System.out.println("Liste des projets:");
        for (Projet projet : projets) {
            System.out.println(projet);
            System.out.println("----------------------------");
        }
    }

    public void listerEmployes() {
        System.out.println("Liste des employés:");
        for (Employe employe : employes) {
            System.out.println(employe);
            System.out.println("----------------------------");
        }
    }

    public void listerTaches() {
        System.out.println("Liste des tâches:");
        for (Tache tache : taches) {
            System.out.println(tache);
            System.out.println("----------------------------");
        }
    }
}
