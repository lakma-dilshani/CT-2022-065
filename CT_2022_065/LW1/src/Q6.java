import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter title:");
        String title = sc.nextLine();
        JFrame f = new JFrame(title);
        f.setSize(w,h);
        f.setVisible(true);

    }
}
