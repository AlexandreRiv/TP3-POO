package strategy;

public class Commande {
    private double prixPlats;
    private double distance;
    private StrategieLivraison strategie;

    public Commande(double prixPlats, double distance, StrategieLivraison strategie) {
        this.prixPlats = prixPlats;
        this.distance = distance;
        this.strategie = strategie;
    }
    public double calculerTotal() {
        double fraisLivraison = strategie.calculerFrais(distance);
        return prixPlats + fraisLivraison;
    }
    public void setStrategie(StrategieLivraison strategie) {
        this.strategie = strategie;
    }
}
