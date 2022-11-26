import java.util.*;

public class Task57 {
    public static void main(String[] args) {
        List<String> bookList = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
        HashMap<String, Integer> bookCountMap = new HashMap<>();

        for (String bookTitle : bookList) {
            if (bookCountMap.containsKey(bookTitle)) {
                int originalCount = bookCountMap.get(bookTitle);
                bookCountMap.put(bookTitle, originalCount + 1); // felülírom a könyv darabszámát
            } else {
                bookCountMap.put(bookTitle, 1);
            }
        }
        // task d - foreach to collect books with 4 count
        List<String> bookWithCountFour = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            if ((int) mapElement.getValue() == 4) {
                bookWithCountFour.add((String) mapElement.getKey());
            }
        }
        // task d - foreach to override book count with 4 count -- next level
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            for (String title : bookWithCountFour) {
                if (bookCountMap.containsKey(title))
                    mapElement.setValue(3);
            }
        }

        // task c - foreach to collect books with 1 count
        List<String> bookWithCountOne = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            if ((int) mapElement.getValue() == 1) {
                bookWithCountOne.add((String) mapElement.getKey());
            }
        }
        // task c - foreach to remove saved books with 1 count
        for (String bookTitle : bookWithCountOne) {
            bookCountMap.remove(bookTitle);
        }

        // task b - foreach for sums
        int sumOfBooks = 0;
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            sumOfBooks += (int) mapElement.getValue();
        }

        // task a - foreach for println
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }

        System.out.println("Number of different titles: " + bookCountMap.size());
        System.out.println("Total number of books (from List): " + bookList.size());
        System.out.println("Total number of books (from Map): " + sumOfBooks);
    }
}
