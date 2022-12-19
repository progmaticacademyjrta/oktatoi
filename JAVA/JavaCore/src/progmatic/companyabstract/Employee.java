package progmatic.companyabstract;

public abstract class Employee {
    protected String name;
    protected String position;

    Employee(String name, String position){
        this.name=name;
        this.position=position;
    }

    abstract void comutePay();

    String getPosition(){
        return position;
    }

    String getName(){
        return name;
    }
}
