package progmatic.racing;

public class MercedesPilotOne implements Car,Racer{
    private String racerName;
    private String nationality;
    private String manufacturer;
    private double acceleration;

    MercedesPilotOne(String racerName, String nationality, String manufacturer){
        this.racerName  = racerName;
        this.nationality  = nationality;
        this.manufacturer  = manufacturer;
    }

    @Override
    public void acceleration(double time) {
        acceleration=time;
    }

    @Override
    public String getCarManufacturer() {
        return manufacturer;
    }

    @Override
    public String getRacerName() {
        return racerName;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "MercedesPilotOne{" +
                "racerName='" + racerName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", acceleration=" + acceleration +
                '}';
    }
}
