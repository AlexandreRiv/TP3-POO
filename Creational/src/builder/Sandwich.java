package builder;

import java.util.List;

public class Sandwich {
    private String pain;
    private String viande;
    private String fromage;
    private List<String> legumes;
    private String sauce;
    private boolean grille;

    // Constructeur privé accessible uniquement par le Builder interne
    Sandwich( CustomSandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.legumes = builder.legumes;
        this.sauce = builder.sauce;
        this.grille = builder.grille;
    }

    @Override
    public String toString() {
        return "Sandwich {" +
                "pain='" + pain + '\'' +
                ", viande='" + viande + '\'' +
                ", fromage='" + fromage + '\'' +
                ", legumes=" + legumes +
                ", sauce='" + sauce + '\'' +
                ", grille=" + grille +
                '}';
    }
}
