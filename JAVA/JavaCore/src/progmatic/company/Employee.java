package progmatic.company;

public class Employee {
    private final String name;
    private final int age;
    private String degree;
    private String gender;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void overtime() {
        System.out.println("Sorry you'll overtime today");
    }

    public void getSalary() {
        System.out.println("Your salary is in the box next to the door.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", degree='" + degree + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
