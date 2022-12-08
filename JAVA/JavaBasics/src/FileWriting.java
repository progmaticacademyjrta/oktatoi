import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriting {

    public static void main(String[] args) {
        String content = "Hello." + System.lineSeparator() + "This is great. " + System.lineSeparator() + "I could create a file from java.";
        try {
            Files.writeString(Paths.get("src/resources/my-new-file.txt"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


