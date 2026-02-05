package factory;

public class ChickenBurger implements Burger {
    private final String description = "Pain burger, poulet pané croustillant, sauce BBQ";
    private final double prix = 9.0;

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
        return "ChickenBurger { " + description + " } - " + prix + "€";
    }
}
