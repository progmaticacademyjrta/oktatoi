package progmatic.auto;

public class Auto {
    private String manufacturer;
    private String model;
    private int releaseDate;
    private int doorCount;
    private String color;

    public Auto(String manufacturer, String model, int releaseDate, int doorCount, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.releaseDate = releaseDate;
        this.doorCount = doorCount;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modelNewValue) {
        this.model = modelNewValue;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "progmatic.auto.Auto{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", releaseDate=" + releaseDate +
                ", doorCount=" + doorCount +
                ", color='" + color + '\'' +
                '}';
    }
}
