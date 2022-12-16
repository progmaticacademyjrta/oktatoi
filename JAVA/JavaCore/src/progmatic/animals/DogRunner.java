package progmatic.animals;

public class DogRunner {
    public static void main(String[] args) {
        Animal frank = new Animal("Frank", 2, 23.12);
        Dog bobby = new Dog("Bobby", 7, 33.33, "sheep");
        System.out.println("--------Frank--------");
        System.out.println("Name: " + frank.getName());
        System.out.println("Age: " + frank.getAge());
        System.out.println("Mass: " + frank.getMass());

        System.out.println("--------Bobby--------");
        System.out.println("Name: " + bobby.getName());
        System.out.println("Age: " + bobby.getAge());
        System.out.println("Mass: " + bobby.getMass());
        System.out.println("Toy: " + bobby.getToy());
        bobby.play();
    }
}
