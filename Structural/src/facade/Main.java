package facade;

public class Main {

    public static void main(String[] args) {
        CommandeValidationFacade facade = new CommandeValidationFacade();
        String userId = "user123";
        String adresse = "123 Rue de la Livraison";

        boolean commandeValide = facade.validerCommande(userId, adresse);
        if (commandeValide) {
            System.out.println("Commande passée avec succès !");
        } else {
            System.out.println("Échec de la commande.");
        }
    }
}
