package progmatic.animals;

public class Dog extends Animal {
    private String toy;

    public Dog(String name, int age, double mass, String toy) {
        super(name, age, mass);
        this.toy = toy;
    }

    public String getToy() {
        return toy;
    }

    public void play() {
        System.out.println(getName() + " plays with: " + toy);
    }
}
