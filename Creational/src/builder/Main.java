package builder;

public class Main {
    public static void main(String[] args) {
        // Sandwich 1 : Simple jambon-fromage
        Sandwich sandwich1 = new CustomSandwichBuilder("baguette")
                .setViande("jambon")
                .setFromage("cheddar")
                .setSauce("mayo")
                .build();
        System.out.println("Sandwich 1 : " + sandwich1);

        // Sandwich 2 : Végétarien complet
        Sandwich sandwich2 = new CustomSandwichBuilder("complet")
                .setFromage("emmental")
                .ajouterLegume("laitue")
                .ajouterLegume("tomate")
                .ajouterLegume("oignon")
                .setSauce("moutarde")
                .setGrille(true)
                .build();
        System.out.println("Sandwich 2 : " + sandwich2);

        // Sandwich 3 : Sandwich complet grillé
        Sandwich sandwich3 = new CustomSandwichBuilder("ciabatta")
                .setViande("poulet")
                .setFromage("bleu")
                .ajouterLegume("laitue")
                .ajouterLegume("cornichon")
                .setSauce("ketchup")
                .setGrille(true)
                .build();
        System.out.println("Sandwich 3 : " + sandwich3);
    }
}

