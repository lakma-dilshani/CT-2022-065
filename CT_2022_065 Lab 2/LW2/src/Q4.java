import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (pounds) :");
        double weight = sc.nextDouble();
        double calories = weight * 19;
        System.out.println("Calories per day: " + calories);

    }
}
