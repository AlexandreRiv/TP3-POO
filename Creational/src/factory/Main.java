package factory;

public class Main {
    public static void main(String[] args) {

        Burger veggie = BurgerFactory.creerBurger(BurgerType.VEGGIE);
        System.out.println(veggie);


        Burger cheese = BurgerFactory.creerBurger(BurgerType.CHEESE);
        System.out.println(cheese);


        Burger chicken = BurgerFactory.creerBurger(BurgerType.CHICKEN);
        System.out.println(chicken);

        double total = veggie.getPrix() + cheese.getPrix() + chicken.getPrix();
        System.out.println("=== Total de la commande : " + total + "€ ===");
    }
}
