package progmatic.eloadasanyag;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee anonymus = new Employee();
        Employee anonymus2 = new Employee("anonymus","n/a");
        System.out.println(anonymus.getName());
        System.out.println(anonymus2.getName());

        Employee bob = new Employee("Bob");
        Employee kateTheDeveloper = new Employee("Kate", "Developer");

        System.out.println(anonymus.getName());

        System.out.println(bob.getName());

        System.out.println(kateTheDeveloper.getName());
        System.out.println(kateTheDeveloper.getRole());
    }
}
