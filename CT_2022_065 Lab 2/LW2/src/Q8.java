import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double volume = (4.0 / 3) * (3.14 * Math.pow(radius, 3));
        System.out.print("Volume of a sphere: " + volume );

    }
}
