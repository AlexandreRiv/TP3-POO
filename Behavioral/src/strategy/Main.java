package strategy;

public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande(30.0, 5.0, new LivraisonStandard());
        System.out.println( "Livraison standart : " + commande.calculerTotal() + "€");
        // Changement de stratégie de livraison
        commande.setStrategie(new LivraisonExpress());
        System.out.println("livraison express : " + commande.calculerTotal() + "€");

        Commande commande2 = new Commande(30.0, 5.0, new ClickAndCollect());
        System.out.println("Click and collect : " + commande2.calculerTotal() + "€");


    }
}
