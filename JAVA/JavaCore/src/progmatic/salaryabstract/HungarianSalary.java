package progmatic.salaryabstract;

public class HungarianSalary extends Salary {
    private final int hungarianTaxes;
    private double salary;

    HungarianSalary(int hungarianTaxes, int dailySalary, int workedDay) {
        this.hungarianTaxes = hungarianTaxes;
        salaryCalculation(dailySalary, workedDay);
    }

    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        double taxesDouble = (hungarianTaxes+100)/100;
        salary = (dailySalary * workedDay) * taxesDouble;
    }

    @Override
    public String toString() {
        return "HungarianSalary{" +
                "hungarianTaxes=" + hungarianTaxes +
                ", salary=" + salary +
                '}';
    }
}
