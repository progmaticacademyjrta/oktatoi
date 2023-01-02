package progmatic.eloadasanyag.abstractdogs;

public abstract class AbstractDog {
    private String type;
    private String name;
    private String gender;
    private String birthDay;
    private String weight;
    private String additionalProperties;

    public AbstractDog(String type, String name, String gender, String birthDay, String weight, String additionalProperties) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.weight = weight;
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "AbstractDog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", weight='" + weight + '\'' +
                ", additionalProperties='" + additionalProperties + '\'' +
                '}';
    }
}
