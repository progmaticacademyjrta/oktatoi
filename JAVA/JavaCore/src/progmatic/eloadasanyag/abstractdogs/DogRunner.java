package progmatic.eloadasanyag.abstractdogs;

public class DogRunner {
    public static void main(String[] args) {
        DogsReader dogsReader = new DogsReader();
        dogsReader.readCsvFile();
        System.out.println(dogsReader.getDogs());
        System.out.println(dogsReader.getDogs().size());
    }
}
