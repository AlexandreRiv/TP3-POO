package strategy;

public class LivraisonExpress implements StrategieLivraison{
    @Override
    public double calculerFrais(double distance) {
        return 1.5 * distance;
    }
}
