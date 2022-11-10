package hu.progmatic;

public class JavaOperators {

    public static void main(String[] args) {
        // ez egy kommentezett sor
        // ez is egy kommenzetett sor

        /* ez is egy kommentezett
        itt minden komment
        System.out.println("Hello");
        */

        short a = 2000; // = értékadás operátor
        short b = 31;

        int c = a + b; // + hozzadás operátor
        System.out.println("c értéke: "+ c);

        int d = a - b;
        System.out.println(d);

        int e = a * b;
        System.out.println(e);

        double f = 9.32;
        double g = 1.93;

        double h = f / g;
        System.out.println(h);

        boolean aIsEqualB = a == b;  // valami egyenlő? akkor ==
        System.out.println(aIsEqualB);

        boolean aIsNotEqualB = a != b;  // valami különbözik? akkor !=
        System.out.println(aIsNotEqualB);

        boolean resultOfAnAndOperator = (a > 200) && (b < -200);    // true && false - csak akkor true ha mindkettő true
        System.out.println(resultOfAnAndOperator);

        boolean resultOfAnOrOperator = (a > 2000000) || (b > -200);  // false || true  - akkor true ha valamelyik true
        System.out.println(resultOfAnOrOperator);

        System.out.println(7 % 2); // We call it modulo, this is the remaining part after division

        int a2 = 5;
        a2++;
        System.out.println("a2 after ++ is " + a2);

        int a3 = 7;
        a3--;
        System.out.println("a3 after -- is " + a3);

        int a4 = 10;
        a4 += 7;
        System.out.println("a4 after += 7 is " + a4);

        int a5 = 1;
        a5 -= 7;
        System.out.println("a5 after -= 7 is " + a5);

        int a6 = 3;
        a6 *= 6;   // a6=a6*6
        System.out.println("a6 after *= 6 is " + a6);

        String hello = "Hello";
        String world = " World!";
        System.out.println(hello + world);


    }
}

