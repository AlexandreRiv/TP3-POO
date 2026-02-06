package singleton;

public class Main {
    public static void main(String[] args) {

        tpe caissier1 = tpe.getInstance();
        tpe caissier2 = tpe.getInstance();
        tpe caissier3 = tpe.getInstance();

        caissier1.enregistrerTransaction(12.50);
        caissier2.enregistrerTransaction(8.90);
        caissier3.enregistrerTransaction(15.00);
        caissier1.enregistrerTransaction(6.50);

        System.out.println("Chiffre d'affaires: " + tpe.getInstance().getChiffreAffaires() + " €");

        System.out.println("Même TPE ? " + (caissier1 == caissier2 && caissier2 == caissier3));

        tpe.getInstance().reset();

        caissier2.enregistrerTransaction(20.00);
        System.out.println("Chiffre d'affaires: " + tpe.getInstance().getChiffreAffaires() + " €");
    }
}

