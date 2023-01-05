package enums;

public class EnumExamples {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        System.out.println(Level.MEDIUM);
        for (Level element : Level.values() ) {
            System.out.println(element);
        }

        System.out.println(Days.FRIDAY);

        // get enum values with a for cycle
        for(int i=0;i < Evaluation.values().length;i++){
            System.out.println(Evaluation.values()[i]);
        }
    }
}
