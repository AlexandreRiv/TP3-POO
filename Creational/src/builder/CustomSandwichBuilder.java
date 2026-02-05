package builder;

import java.util.ArrayList;
import java.util.List;

public class CustomSandwichBuilder {
    String pain;
    String viande;
    String fromage;
    List<String> legumes = new ArrayList<>();
    String sauce;
    boolean grille;

    public CustomSandwichBuilder(String pain) {
        this.pain = pain;

    }

    public CustomSandwichBuilder setViande(String viande) {
        this.viande = viande;
        return this;
    }

    public CustomSandwichBuilder setFromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public CustomSandwichBuilder ajouterLegume(String legume) {
        this.legumes.add(legume);
        return this;
    }

    public CustomSandwichBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public CustomSandwichBuilder setGrille(boolean grille) {
        this.grille = grille;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }
}