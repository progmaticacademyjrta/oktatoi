package progmatic.vehicles;

public class Vehicle {
    String manufacturer;
    String type;
    String color;
    int numberOfPassengers;
    boolean isSelfDriving;

    public Vehicle(String manufacturer, String type, String color, int numberOfPassengers, boolean isSelfDriving) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.isSelfDriving = isSelfDriving;
    }

    public void accelerate() {
        System.out.println("The vehicle accelerates...");
    }

    public void stop() {
        System.out.println("The vehicle stops...");
    }

    public void honk() {
        System.out.println("The vehicle honks...");
    }

    public void usesTurnSignal() {
        System.out.println("The vehicle uses the turn signal");
    }

}
