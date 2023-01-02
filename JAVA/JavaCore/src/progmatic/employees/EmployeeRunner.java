package progmatic.employees;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeReader employeeReader = new EmployeeReader();
        employeeReader.readCsv();
        System.out.println(employeeReader.getEmployeeList());
    }
}
