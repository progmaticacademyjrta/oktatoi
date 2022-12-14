package progmatic.registrationform;

import java.util.Scanner;

public class RegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your e-mail address:");
        String email = scanner.nextLine();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your birth date:");
        String birthday = scanner.nextLine();
        System.out.println("Please enter your workplace:");
        String workplace = scanner.nextLine();
        System.out.println("Please enter your phone number:");
        String phone = scanner.nextLine();

        if (email.isEmpty() || name.isEmpty() || birthday.isEmpty()){
            System.out.println("The email, name, and birth date must not be empty!");
            System.exit(0);  //megszakítja a program futását, kilép ua. mint a return; utasítás
        }

        User testElek = new User(email, name, birthday);
        if (!workplace.isEmpty()) {
            testElek.setCompany(workplace);
        }
        if (!phone.equals("")) {   // vagy ez a feltétel is jó if(phone.length() > 0))
            testElek.setPhone(Integer.parseInt(phone));
        }
        System.out.println(testElek);
    }
}
