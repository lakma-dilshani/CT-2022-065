package q10;

import java.util.Scanner;

public class Q10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome.");
        }else {
            System.out.println("It is not a palindrome.");
        }

    }
}
