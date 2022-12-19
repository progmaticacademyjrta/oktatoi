package progmatic.salaryabstract;

public abstract class Salary {
    abstract void salaryCalculation(int dailySalary, int workedDay);

    void writeThanksNote(){
        System.out.println("Thanks for using me and let me assist in your calculation");
    }
}
