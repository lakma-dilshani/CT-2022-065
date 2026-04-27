import java.util.Scanner;

public class Q10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd-length word:");
        String input = sc.nextLine();
        int middle = input.length()/2;
        System.out.println(input.charAt(middle));

    }
}
