package builder;

public interface SandwichBuilder {
    void setPain(String pain);
    void setViande(String viande);
    void setFromage(String fromage);
    void ajouterLegume(String legume);
    void setSauce(String sauce);
    void setGrille(boolean grille);
}
