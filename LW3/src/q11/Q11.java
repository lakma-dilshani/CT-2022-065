package q11;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.println("Guess the number (1-100):");
            guess = sc.nextInt();

            if (guess > number){
                System.out.println("Lower");
            } else if (guess < number) {
                System.out.println("Higher");
            }
            else {
                System.out.println("Correct! You guessed the number.");
            }

        }while (guess != number);
    }
}
