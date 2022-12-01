public class StringMethods {

    public static void main(String[] args) {
        String text = "Progmatic ";
        System.out.println("Default text: " + text);

        // Examples for charAt()
        char characterFromText = text.charAt(0);
        System.out.println(characterFromText);

        System.out.println(text.charAt(8));

        // Examples for length() to get the length of the text
        System.out.println(text.length());
        String textTrimmed = text.trim();
        System.out.println(textTrimmed);
        System.out.println(textTrimmed.length());

        // Save text to char array
        char[] textArray = text.toCharArray();
        System.out.println(textArray[8]);

        // tolower and toupper
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // kivágunk egy részletet a szövegből
        System.out.println(text.substring(1, 4)); // a 4. indexű elemet már nem tartalmazza

        // logikai igaz vagy hamist ad vissza a három metódus
        System.out.println(text.startsWith("Prog")); // kis és nagybetűs érzékeny
        System.out.println(text.endsWith("tic "));// kis és nagybetűs érzékeny
        System.out.println(text.contains("Prog"));// kis és nagybetűs érzékeny

        // csere a text-ben
        String newtext = text.replace("a","*"); // le kell menteni külön változóba mert nem tudja felülírni magát
        System.out.println(newtext);

        String price = "5600-Ft";
        String[] splittedPrice = price.split("-");
        System.out.println(splittedPrice[0]);
        int priceInt = Integer.parseInt(splittedPrice[0]);
    }
}

