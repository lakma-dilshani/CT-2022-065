package q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0 ){
                if (year % 400 == 0){
                    System.out.println("This is a leap year.");
                }else{
                    System.out.println("This is not a leap year.1");
                }
            }else {
                System.out.println("This is a leap year.");
            }
        }else{
            System.out.println("This is not a leap year.");
        }
    }
}
