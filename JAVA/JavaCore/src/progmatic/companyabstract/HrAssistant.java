package progmatic.companyabstract;

public class HrAssistant extends Employee {
    private boolean noMorePeople;
    private int salary;

    HrAssistant(String name, String position, boolean noMorePeople) {
        super(name, position);
        this.noMorePeople =noMorePeople;
        comutePay();
    }

    @Override
    void comutePay() {
        if(noMorePeople){
            salary=100;
        }else{
            salary=1000000;
        }
    }

    @Override
    public String toString() {
        return "HrAssistant{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", noMorePeople=" + noMorePeople +
                ", salary=" + salary +
                '}';
    }
}
