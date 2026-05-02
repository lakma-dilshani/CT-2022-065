import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Celsius :");
        double celsius = sc.nextDouble();
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.println("Fahrenheit : " + fahrenheit);

    }
}
