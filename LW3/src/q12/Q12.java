package q12;

import java.util.Scanner;

public class Q12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();

        String updatedSentence = sentence.replace(oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(updatedSentence);
    }
}
