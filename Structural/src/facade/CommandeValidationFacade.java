package facade;

import facade.services.*;

public class CommandeValidationFacade {
    private AuthService authService;
    private StockService stockService;
    private PreparationService preparationService;
    private LivreurService livreurService;
    private AdresseService adresseService;

    public CommandeValidationFacade() {
        this.authService = new AuthService();
        this.stockService = new StockService();
        this.preparationService = new PreparationService();
        this.livreurService = new LivreurService();
        this.adresseService = new AdresseService();
    }

    public boolean validerCommande(String userId, String adresse) {
        return authService.verifierConnexion(userId)
                && stockService.verifierDisponibiliteIngredients()
                && preparationService.verifierTempsPreparation()
                && livreurService.verifierDisponibiliteLivreur()
                && adresseService.verifierPerimetreLivraison(adresse);
    }
}
