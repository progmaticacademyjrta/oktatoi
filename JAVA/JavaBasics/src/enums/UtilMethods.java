package enums;

import java.util.Random;

public class UtilMethods {

    public static int getARandomNumber(int bound, boolean isZeroNeeded) {
        Random rnd = new Random();
        int rndNumber;
        if (isZeroNeeded)
            rndNumber = rnd.nextInt(bound);
        else
            rndNumber = rnd.nextInt(bound) + 1;
        return rndNumber;
    }
}
