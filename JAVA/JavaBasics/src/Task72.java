import java.util.Arrays;
import java.util.List;

public class Task72 {
    /**
     * Összegezzük, hogy összesen hány céget vásároltak fel a fenti úriemberek.
     */
    public static void main(String[] args) {
        List<String> loggedCompanies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,11", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3"
        );
        System.out.println("Total count:" + getCompaniesCount(loggedCompanies));
    }

    /**
     * This method add the numbers in the List
     * @param list list of companies and their count
     * @return total count of the Companies
     */
    public static int getCompaniesCount(List<String> list){
        int number = 0;
        for (String element : list) {
             String[] array = element.split(",");
            // String numberAsString = array[1];
            String numberAsString = element.split(",")[1];
            // number = number + Integer.parseInt(numberAsString);
            number += Integer.parseInt(numberAsString);
        }
        return number;
    }
}
