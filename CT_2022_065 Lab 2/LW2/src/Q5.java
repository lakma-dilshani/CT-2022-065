import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Fahrenheit :");
        double fahrenheit = sc.nextDouble();
        double celsius =  (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Celsius: " + celsius);


    }
}
