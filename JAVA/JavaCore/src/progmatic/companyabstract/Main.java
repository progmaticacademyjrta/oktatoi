package progmatic.companyabstract;

public class Main {
    public static void main(String[] args) {
        SoftwareTester john = new SoftwareTester("John","Junior Tester",37);
        System.out.println(john);
        HrAssistant magdianyus = new HrAssistant("MagdiAnyus","Chief HR Assistant",false);

        System.out.println(magdianyus);
    }
}
