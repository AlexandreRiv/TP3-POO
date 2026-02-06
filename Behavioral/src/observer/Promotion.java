package observer;

public class Promotion {
    private String nomPromotion;
    private int reductionPourcentage;

    public Promotion(String nomPromotion, int reductionPourcentage) {
        this.nomPromotion = nomPromotion;
        this.reductionPourcentage = reductionPourcentage;
    }

    public String getNomPromotion() {
        return nomPromotion;
    }

    public int getReductionPourcentage() {
        return reductionPourcentage;
    }


}
