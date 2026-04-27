import java.awt.*;
import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with a single exclamation mark:");
        String input = sc.nextLine();
        int index = input.indexOf('!');
        String before = input.substring(0, index).trim();
        String after = input.substring(index + 1).trim();
        System.out.println(before);
        System.out.println(after);

   }

}
