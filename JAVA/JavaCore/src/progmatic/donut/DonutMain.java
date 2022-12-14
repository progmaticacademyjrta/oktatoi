package progmatic.donut;

public class DonutMain {
    public static void main(String[] args) {
        Donut klasszik = new Donut("kerek",10, "csokis","liszt", "porcukor");
        Donut csoroge = new Donut("hosszukas",10, "natur","liszt", "porcukor");
        Donut kocka = new Donut("kocka",15, "lekváros","liszt", "porcukor");

        System.out.println(klasszik);
        System.out.println(csoroge);
        System.out.println(kocka);
    }
}
