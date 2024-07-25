import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: " );

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        double a = sc.nextDouble();

        System.out.println("enter b: ");
        double b = sc.nextDouble();

        if (a != 0 ){
            double solution = -b / a;
            System.out.printf("the solution is: %f!", solution);
        } else {
            if (b == 0 ){
                System.out.println("the solution is all x!");
            } else {
                System.out.println("no solution!");
            }
        }
    }
}