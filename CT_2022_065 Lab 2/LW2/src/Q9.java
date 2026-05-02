import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P (Dollars): ");
        double P = sc.nextDouble();
        System.out.print("Enter R (Interest Rate): ");
        double R = sc.nextDouble();
        System.out.print("Enter N (Years): ");
        int N = sc.nextInt();
        double amount = P * Math.pow((1 + (R / 100)), N);
        System.out.println("Total amount of money earned after N years. : " + amount);

    }
}
