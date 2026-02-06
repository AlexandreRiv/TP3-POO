package singleton;

public class tpe {
    private static tpe instance;
    private double chiffreAffaires;

    private tpe() {
        this.chiffreAffaires = 0;
    }

    public static tpe getInstance() {
        if (instance == null) {
            instance = new tpe();
        }
        return instance;
    }

    public void enregistrerTransaction(double montant) {
        this.chiffreAffaires += montant;
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void reset() {
        this.chiffreAffaires = 0;
    }
}

