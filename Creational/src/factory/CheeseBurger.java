package factory;

public class CheeseBurger implements Burger {
    private final String description = "Pain sésame, steak haché, cheddar fondu";
    private final double prix = 10.0;

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
        return "CheeseBurger { " + description + " } - " + prix + "€";
    }
}
