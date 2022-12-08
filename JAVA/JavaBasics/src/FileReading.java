import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {

    public static void main(String[] args) {
        try {
            List<String> fileContentList = Files.readAllLines(Paths.get("src/resources/my-new-file.txt"));
            System.out.println(fileContentList.size());
            System.out.println(fileContentList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


