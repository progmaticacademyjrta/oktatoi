package progmatic.companyabstract;

public class SoftwareTester extends Employee{
    private int bugCount;
    private int salary;

    SoftwareTester(String name, String position, int bugCount) {
        super(name, position);
        this.bugCount = bugCount;
        comutePay();
    }

    @Override
    void comutePay() {
        salary = 20000*bugCount;
    }

    @Override
    public String toString() {
        return "SoftwareTester{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", bugCount=" + bugCount +
                ", salary=" + salary +
                '}';
    }
}
