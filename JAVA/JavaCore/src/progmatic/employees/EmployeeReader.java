package progmatic.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {
    List<Employee> employeeList = new ArrayList<>();

    void readCsv() {
        try {
            List<String> fileContent = Files.readAllLines(Path.of("src/resources/employee.csv"));
            for (String row : fileContent) {
                String[] rowData = row.split(", ");
                String position = rowData[0];
                String name = rowData[1];
                String salary = rowData[2];
                String customField = rowData[3];
                if (position.equals("Tester")) {
                    employeeList.add(new Tester(position, name, salary, customField));
                } else if (position.equals("Developer")) {
                    employeeList.add(new Developer(position, name, salary, customField));
                } else if (position.equals("ExecutiveDirector")) {
                    employeeList.add(new ExecutiveDirector(position, name, salary, customField));
                } else if (position.equals("HrAssistant")) {
                    employeeList.add(new HrAssistant(position, name, salary, customField));
                }else if (position.equals("FinanceAssistant")) {
                    employeeList.add(new FinanceAssistant(position, name, salary, customField));
                } else {
                    System.out.println("Wrong data: " + row);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
