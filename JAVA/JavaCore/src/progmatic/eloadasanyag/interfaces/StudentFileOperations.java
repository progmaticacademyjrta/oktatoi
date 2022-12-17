package progmatic.eloadasanyag.interfaces;

import progmatic.eloadasanyag.interfaces.studentintefaces.StudentReader;
import progmatic.eloadasanyag.interfaces.studentintefaces.StudentSaver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentFileOperations implements StudentReader, StudentSaver {
    private final String fileName = "student.txt";

    @Override
    public void save(String student) {
        try {
            Files.writeString(Path.of("src/resources/" + fileName), student);
            System.out.println("Data saved:" + student);
        } catch (IOException ex) {
            System.out.println("Cannot write file");
        }
    }

    @Override
    public List<String> read() {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Path.of("src/resources/" + fileName));
        } catch (IOException ex) {
            System.out.println("Cannot read file");
        }
        return result;
    }

}
