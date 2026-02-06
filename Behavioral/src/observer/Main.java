package observer;

public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

        ClientVIP client1 = new ClientVIP("TT");
        ClientVIP client2 = new ClientVIP("Lulu");

        restaurant.ajouterClientVIP(client1);
        restaurant.ajouterClientVIP(client2);

        Promotion promotion1 = new Promotion("Burger à moitié prix", 50);
        Promotion promotion2 = new Promotion("Menu gratuit pour les enfants", 100);

        restaurant.notifierClients(promotion1);
        restaurant.notifierClients(promotion2);

        restaurant.supprimerClientVIP(client2);

        Promotion promotion3 = new Promotion("Frites gratuites avec chaque burger", 0);
        restaurant.notifierClients(promotion3);
    }
}
