package strategy;

public class LivraisonStandard implements StrategieLivraison{
    @Override
    public double calculerFrais(double distance) {
        return 0.5 * distance;
    }
}
