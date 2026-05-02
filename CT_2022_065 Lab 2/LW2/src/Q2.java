import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter centimeters :");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double remainingInches = inches % 12;
        System.out.print(feet + " Feet ");
        System.out.print(remainingInches +" Inches ");

    }
}
