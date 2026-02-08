package adapter;


import java.util.Map;

import static java.lang.Double.parseDouble;


public class CSVAdapter implements AnalyseurVentes{
    private LecteurCSV lecteur;

    public CSVAdapter(String cheminFichier) {
        this.lecteur = new LecteurCSV(cheminFichier);
    }



    @Override
    public double getTotalVentes() {
        double total = 0.0;
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            double prix = parseDouble(colonnes[2].split("x")[0]);
            double quantite = parseDouble(colonnes[2].split("x")[1]);
            total += prix * quantite;
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        int nbCommands;
        nbCommands = lecteur.getNbLignes() - 1;
        return nbCommands;
    }

    @Override
    public Map<String, Double> getCAParProduit(){
        Map<String, Double> caParProduit = new java.util.HashMap<>();
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            String produit = colonnes[1];
            double prix = parseDouble(colonnes[2].split("x")[0]);
            double quantite = parseDouble(colonnes[2].split("x")[1]);
            caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + prix * quantite);
        }
        return caParProduit;
    }
}
