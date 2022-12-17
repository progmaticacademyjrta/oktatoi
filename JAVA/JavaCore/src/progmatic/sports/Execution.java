package progmatic.sports;

public class Execution {
    public static void main(String[] args) {
        SemiFinal semiFinal = new SemiFinal("Katar","Football");
        //semiFinal.setLocation("Katar");
        //System.out.println(semiFinal.getLocation());
        semiFinal.setEventName();
        semiFinal.setHomeTeam("Franciaorszag");
        semiFinal.setAwayTeam("Marokko");
        System.out.println(semiFinal);
    }
}
