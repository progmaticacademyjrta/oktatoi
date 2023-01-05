public class Task104 {
    /**
     * Készíts egy alkalmazást, amely folyamatosan egymás alá kiírja az aktuális timestamp-et,
     * az aktuális időt, miliszekundumban.
     * (szakítsuk meg a program futását a 100. alkalom után)
     */
    public static void main(String[] args) {


        int count = 0;
        do {
            count++;
            long milliseconds = System.currentTimeMillis(); //UTC aktuális idő (GMT+0)
            System.out.println(milliseconds);
        } while (count < 1000);
    }
}
