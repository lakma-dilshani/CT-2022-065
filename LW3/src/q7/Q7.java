package q7;

import java.util.Scanner;

public class Q7 {
    public static int countDigits(int num){
        int count =0;

        while (num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter a number:");
            int number = sc.nextInt();

            if (number < 0){
                break;
            }
            int digits = countDigits(number);
            System.out.println("Number of digits:" + digits);
        }
        System.out.println("Program ended.");
    }
}
