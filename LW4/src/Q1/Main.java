package Q1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in celsius:");
        double celsius = input.nextDouble();

        Temperature temp = new Temperature(celsius);

        System.out.println("Temperature in Fahrenheit:" + temp.toFahrenheit());
    }
}
