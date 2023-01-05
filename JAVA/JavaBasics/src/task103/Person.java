package task103;

import java.time.LocalDate;
import java.util.List;

public class Person {
    /*
      Készítsetek programot, mely képes arra, hogy a console-ról Stringként beolvassa az adataitokat
      és letárolja egy Person nevű DOJO osztályban azokat. Minimum keresztnév, vezetéknév,
      születési hely, (String-ként) és születési idő (LocalDate-ként), valamint kedvenc filmek
      listája (List<String>-ként), boldog-e (boolean), testmagasság (int-ként) kerüljön
      letárolásra private osztályváltozók segítségével. Ezen, példányosításkor kötelezően
      megadandó attribútumok pedig konstruktor segítségével kapjanak értéket. E mellett
      adjatok hozzá legalább 2 tetszőleges opcionális attribútumot az osztályhoz, melyet
      példányosítást követően a setter metódusokkal (ha akarunk), be lehet állítani
      . Készítsetek egy toString metódust is, mely visszaadja az összes beállított tulajdonságot,
      és írassátok ki vele a konzolra a lementett adatokat.
    */
    private final String firstName;
    private final String lastName;
    private final String placeOfBirth;
    private final LocalDate timeOfBirth;
    private final List<String> favoriteMovies;
    private final boolean isHappy;
    private final int height;
    private int weight;
    private int numberOfYearlyBlackOut;

    public Person(String firstName,
                  String lastName,
                  String placeOfBirth,
                  LocalDate timeOfBirth,
                  List<String> favoriteMovies,
                  boolean isHappy,
                  int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.placeOfBirth = placeOfBirth;
        this.timeOfBirth = timeOfBirth;
        this.favoriteMovies = favoriteMovies;
        this.isHappy = isHappy;
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfYearlyBlackOut(int numberOfYearlyBlackOut) {
        this.numberOfYearlyBlackOut = numberOfYearlyBlackOut;
    }

    @Override
    public String toString() {
        return "{firstName:" + firstName + "\n" +
                "lastName:" + lastName + "\n" +
                "placeOfBirth:" + placeOfBirth + "\n" +
                "timeOfBirth:" + timeOfBirth + "\n" +
                "favoriteMovies:" + favoriteMovies + "\n" +
                "isHappy:" + isHappy + "\n" +
                "height:" + height + "\n" +
                "weight:" + weight + "\n" +
                "numberOfYearlyBlackOut:" + numberOfYearlyBlackOut + "}";
    }
}
