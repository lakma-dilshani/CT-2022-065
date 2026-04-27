import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First:");
        String first= sc.nextLine();

        System.out.print("Middle:");
        String middle = sc.nextLine();

        System.out.print("Last:");
        String last = sc.nextLine();

        System.out.println(first +" " + middle.charAt(0) + "." + last);

    }
}
