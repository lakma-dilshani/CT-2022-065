import javax.swing.*;

public class Q2 {
    static void main(String[] args) {
        String first = JOptionPane.showInputDialog("Enter first name:");
        String last = JOptionPane.showInputDialog("Enter last name:");

        JFrame frame = new JFrame(first + " " + last);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
