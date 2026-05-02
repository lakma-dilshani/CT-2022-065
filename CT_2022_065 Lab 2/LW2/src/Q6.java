import java.time.Year;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Birth Year :");
        int birthyear = sc.nextInt();
        int currentyear = Year.now().getValue();
        int age = currentyear - birthyear;
        System.out.println("You were born in " + birthyear + " and will be (are) " + age + " this year.");

    }
}
