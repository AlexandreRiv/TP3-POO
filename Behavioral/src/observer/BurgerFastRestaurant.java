package observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private List<ClientVIP> clientsVIP = new ArrayList<>();
    public void ajouterClientVIP(ClientVIP client) {
        clientsVIP.add(client);
    }
    public void supprimerClientVIP(ClientVIP client) {
        clientsVIP.remove(client);
    }

    public void notifierClients(Promotion promotion) {
        for (ClientVIP client : clientsVIP) {
            System.out.println(client.recevoirNotification(promotion));
        }
    }

}
