package progmatic.company;

public class DirectReport extends Employee {
    private String goal;
    private boolean isPartTimeWorker;

    public DirectReport(String name, int age) {
        super(name, age);
    }

    public DirectReport(String name, int age, boolean isPartTimeWorker) {
        super(name, age);
        this.isPartTimeWorker = isPartTimeWorker;
    }

    public void createExcelTable() {
        System.out.println("Here is the excel sheet.");
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "DirectReport{" +
                "goal='" + goal + '\'' +
                ", isPartTimeWorker=" + isPartTimeWorker +
                ", " + super.toString() +
                '}';
    }
}
