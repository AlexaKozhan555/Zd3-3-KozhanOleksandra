import java.util.Scanner;

public class Zd3_3_KozhanOleksandra {
    public static void main(String[] args) {
        System.out.println("Program rozwiązuje takie równanie kwadratowe:");
        System.out.println("ax^2 + bx + c = 0");

        Scanner in_KozhanOleksandra = new Scanner(System.in);
        System.out.println("Wpisz liczbe a: ");

        int a_KozhanOleksandra = in_KozhanOleksandra.nextInt();
        switch ((int) a_KozhanOleksandra){
            case 0:
                System.out.println("a nie moze byc rowne 0");
                System.exit(a_KozhanOleksandra) ;
                break;

        }
        System.out.println("Wpisz liczbe b: ");
        int b_KozhanOleksandra = in_KozhanOleksandra.nextInt();
        System.out.println("Wpisz liczbe c: ");
        int c_KozhanOleksandra = in_KozhanOleksandra.nextInt();

        double D = b_KozhanOleksandra * b_KozhanOleksandra - 4 * a_KozhanOleksandra * c_KozhanOleksandra;



        if (D > 0) {
            double x1, x2;
            x1 = (-b_KozhanOleksandra - Math.sqrt(D)) / (2 * a_KozhanOleksandra);
            x2 = (-b_KozhanOleksandra + Math.sqrt(D)) / (2 * a_KozhanOleksandra);
            System.out.println("Pierwiastek równania: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b_KozhanOleksandra / (2 * a_KozhanOleksandra);
            System.out.println("Równanie ma pojedynczy pierwiastek: x = " + x);
        }
        else {
            System.out.println("Równanie nie ma pierwiastka!");


        }
    }
}