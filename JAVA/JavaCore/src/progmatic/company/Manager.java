package progmatic.company;

public class Manager extends Employee {
    private boolean amIworkingToday;
    private int roomsize;

    public Manager(String name, int age) {
        super(name, age);
    }

    public void leadingThePeople() {
        System.out.println("I'm leading the people now.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "amIworkingToday=" + amIworkingToday +
                ", roomsize=" + roomsize +
                ", " + super.toString() +
                '}';
    }
}
