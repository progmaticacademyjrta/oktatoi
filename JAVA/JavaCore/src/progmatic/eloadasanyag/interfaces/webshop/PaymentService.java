package progmatic.eloadasanyag.interfaces.webshop;

import java.util.Random;

public class PaymentService {
    /**
     * Számolja ki a fizetendő összeget.
     */
    public int getPrice(){
        Random random = new Random();
        int price = random.nextInt(1000000)+1;
        return price;
    }
}
