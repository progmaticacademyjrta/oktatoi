package progmatic.sports;

public class SemiFinal implements Events, Sports {
    private String location;
    private String eventName;
    private String homeTeam;
    private String awayTeam;
    private String sportType;

    public SemiFinal(String location, String sportType) {
        this.location = location;
        this.sportType = sportType;
    }

    @Override
    public void setEventName() {
        eventName = "WorldCup Semifinal";
    }

    @Override
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setHomeTeam(String name) {
        homeTeam = name;
    }

    @Override
    public void setAwayTeam(String name) {
        awayTeam = name;
    }

    @Override
    public String getSportType() {
        return sportType;
    }

    @Override
    public String toString() {
        return "SemiFinal{" +
                "location='" + location + '\'' +
                ", eventName='" + eventName + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
