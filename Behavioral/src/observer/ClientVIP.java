package observer;

public class ClientVIP {
    private String nomClient;

    public ClientVIP(String nomClient) {
        this.nomClient = nomClient;
    }

    public String recevoirNotification(Promotion promotion) {
        return "Nouvelle promotion pour " + nomClient + ": " + promotion.getNomPromotion() + " avec " + promotion.getReductionPourcentage() + "% de réduction!";
    }

    public String getNomClient() {
        return nomClient;
    }
}
