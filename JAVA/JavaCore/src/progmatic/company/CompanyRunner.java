package progmatic.company;

public class CompanyRunner {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 34);
        DirectReport employee = new DirectReport("Katy", 25, true);

        System.out.println("-------manager-------");
        manager.overtime();  //employee ősből jön
        manager.getSalary();//employee ősből jön
        manager.leadingThePeople(); //saját metódus
        System.out.println(manager);

        System.out.println("-------direct report-------");
        employee.overtime();//employee ősből jön
        employee.getSalary();//employee ősből jön
        employee.createExcelTable();//saját metódus
        employee.setGoal("Create 5 excel table");
        System.out.println(employee);
    }
}
