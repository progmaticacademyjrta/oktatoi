package progmatic.employees;

import progmatic.eloadasanyag.abstractdogs.AbstractDog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {
    List<Employee> employeeList = new ArrayList<>();

    void readCsv(){
        try {
            List<String> fileContent =  Files.readAllLines(Path.of("src/resources/employee.csv"));
            for (String row : fileContent ) {
                String[] rowData = row.split(", ");
                String position = rowData[0];
                String name = rowData[1];
                String salary = rowData[2];
                String customField = rowData[3];
            }
            System.out.println(fileContent.get(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
