package adapter;

public class Main {
    public static void main(String[] args) {
        AnalyseurVentes csvAnalyseur = new CSVAdapter("C:\\Users\\alexa\\Desktop\\Cours\\POO\\TP3-POO\\Structural\\src\\adapter\\ventes.csv");
        BurgerAnalytics analytics = new BurgerAnalytics(csvAnalyseur);
        analytics.genererRapport();
    }
}
