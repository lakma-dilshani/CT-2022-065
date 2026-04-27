import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name(First Middle Last):");
        String first = sc.next();
        String middle = sc.next();
        String last = sc.next();
        System.out.println(last + "," + first + " " + middle.charAt(0) + ".");

    }
}
