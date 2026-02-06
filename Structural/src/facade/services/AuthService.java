package facade.services;

public class AuthService {
    public boolean verifierConnexion(String userId) {
        System.out.println(userId +" connecté avec succès.");
        return true;
    }
}
