package progmatic.eloadasanyag.interfaces.webshop;

import java.util.Random;

public class ProductAvailabilityService {
    /**
     * Adja vissza, hogy az adott termék van-e raktáron.
     */
    public boolean getAvailable(){
        Random random = new Random();
        int result = random.nextInt(4); //0-tól 3ig generál számot
        if (result==0)
            return false;
        else
            return true;
    }
}
