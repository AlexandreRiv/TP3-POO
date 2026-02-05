package factory;

public class BurgerVeggie implements Burger {
    private final String description = "Pain complet, salade, tomate, carotte";
    private final double prix = 8.0;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrix() {
        return prix;
    }


    @Override
    public String toString() {
        return "BurgerVeggie { " + description + " } - " + prix + "€";
    }
}
