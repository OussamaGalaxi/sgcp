import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionnaireConstruction gestionnaire = new GestionnaireConstruction();
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        while (!quitter) {
            System.out.println("1. Ajouter un projet");
            System.out.println("2. Ajouter un employé");
            System.out.println("3. Ajouter une tâche");
            System.out.println("4. Lister les projets");
            System.out.println("5. Lister les employés");
            System.out.println("6. Lister les tâches");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom du projet: ");
                    String nomProjet = scanner.nextLine();
                    System.out.print("Emplacement du projet: ");
                    String emplacementProjet = scanner.nextLine();
                    System.out.print("Budget du projet: ");
                    double budgetProjet = scanner.nextDouble();
                    scanner.nextLine();  // Consommer la nouvelle ligne
                    gestionnaire.ajouterProjet(new Projet(nomProjet, emplacementProjet, budgetProjet));
                    break;
                case 2:
                    System.out.print("Nom de l'employé: ");
                    String nomEmploye = scanner.nextLine();
                    System.out.print("Rôle de l'employé: ");
                    String roleEmploye = scanner.nextLine();
                    System.out.print("Salaire de l'employé: ");
                    double salaireEmploye = scanner.nextDouble();
                    scanner.nextLine();  // Consommer la nouvelle ligne
                    System.out.print("Nom du projet associé: ");
                    String nomProjetAssocie = scanner.nextLine();
                    Projet projetAssocie = null;
                    for (Projet projet : gestionnaire.getProjets()) {
                        if (projet.getNom().equals(nomProjetAssocie)) {
                            projetAssocie = projet;
                            break;
                        }
                    }
                    if (projetAssocie != null) {
                        gestionnaire.ajouterEmploye(new Employe(nomEmploye, roleEmploye, salaireEmploye, projetAssocie));
                    } else {
                        System.out.println("Projet non trouvé !");
                    }
                    break;
                case 3:
                    System.out.print("Description de la tâche: ");
                    String descriptionTache = scanner.nextLine();
                    System.out.print("Nom du projet associé: ");
                    nomProjetAssocie = scanner.nextLine();
                    projetAssocie = null;
                    for (Projet projet : gestionnaire.getProjets()) {
                        if (projet.getNom().equals(nomProjetAssocie)) {
                            projetAssocie = projet;
                            break;
                        }
                    }
                    if (projetAssocie != null) {
                        gestionnaire.ajouterTache(new Tache(descriptionTache, projetAssocie));
                    } else {
                        System.out.println("Projet non trouvé !");
                    }
                    break;
                case 4:
                    gestionnaire.listerProjets();
                    break;
                case 5:
                    gestionnaire.listerEmployes();
                    break;
                case 6:
                    gestionnaire.listerTaches();
                    break;
                case 7:
                    quitter = true;
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }

        scanner.close();
    }
}