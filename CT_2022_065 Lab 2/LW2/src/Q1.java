import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        double A = sc.nextDouble();

        System.out.print("Enter B: ");
        double B = sc.nextDouble();

        System.out.print("Enter C: ");
        double C = sc.nextDouble();

        System.out.print("Enter X: ");
        double X = sc.nextDouble();

        System.out.print("Enter Y: ");
        double Y = sc.nextDouble();

        System.out.print("Enter radius r: ");
        double r = sc.nextDouble();

        // a
        double a = Math.sqrt(B * B + 4 * A * C);

        // b
        double b = Math.sqrt(X + 4 * Math.pow(Y, 3));

        // c
        double c = Math.cbrt(X * Y);

        // d
        double d = Math.PI * r * r;

        System.out.println("(a) = " + a);
        System.out.println("(b) = " + b);
        System.out.println("(c) = " + c);
        System.out.println("(d) Area of circle = " + d);

    }
}

