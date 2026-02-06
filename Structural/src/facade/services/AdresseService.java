package facade.services;

public class AdresseService {
    public boolean verifierPerimetreLivraison(String adresse) {
        System.out.println(adresse + " est dans le périmètre de livraison.");
        return true;
    }
}
