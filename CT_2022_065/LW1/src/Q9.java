import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String input:");
        String input = sc.nextLine();
        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length() - 1));

    }
}
