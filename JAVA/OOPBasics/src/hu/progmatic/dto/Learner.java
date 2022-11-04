package hu.progmatic.dto;

import java.time.LocalDate;
import java.time.Period;

public class Learner {
    String name;
    LocalDate birthday;
    String address;
    String phone;
    String nationality;
    String hobbies;

    public Learner(String name, String birthday, String address, String phone, String nationality, String hobbies) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
        this.address = address;
        this.phone = phone;
        this.nationality = nationality;
        this.hobbies = hobbies;
    }

    public int getAge() {
        Period period = Period.between(birthday, LocalDate.now());
        return period.getYears();
    }

}
