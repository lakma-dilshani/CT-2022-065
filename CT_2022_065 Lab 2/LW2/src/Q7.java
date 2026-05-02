import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        double BMI = weight /Math.pow((height * 100.0),2);
        System.out.println("BMI :" + BMI );

    }
}
