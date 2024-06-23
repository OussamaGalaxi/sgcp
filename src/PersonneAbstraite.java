public abstract class PersonneAbstraite implements Personne {
    protected String nom;
    protected String role;
    protected double salaire;

    public PersonneAbstraite(String nom, String role, double salaire) {
        this.nom = nom;
        this.role = role;
        this.salaire = salaire;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return String.format("Personne: %s\nRole: %s\nSalaire: %.2f DH ", nom, role, salaire);
    }
}
