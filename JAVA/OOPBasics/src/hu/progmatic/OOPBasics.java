package hu.progmatic;

import hu.progmatic.dto.Learner;

public class OOPBasics {

    public static void main(String[] args) {
        Learner jancsi = new Learner("Jancsi", "1993-01-01", "Kerekerdo utca 1", "+36901234567", "magyar", "festeszet");
        Learner juliska = new Learner("Jancsi", "1990-07-15", "Csillagtisztas ter 101", "+36807654321", "magyar", "anyagszobraszat");

        System.out.println("Jancsi most " + jancsi.getAge() + " eves");
        System.out.println("Juliska most " + juliska.getAge() + " eves");
    }
}
