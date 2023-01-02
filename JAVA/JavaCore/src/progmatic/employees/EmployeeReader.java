package progmatic.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeReader {

    void readCsv(){
        try {
            List<String> fileContent =  Files.readAllLines(Path.of("src/resources/employee.csv"));
            for (String row : fileContent ) {

            }
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
