import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss a");
        JFrame frame = new JFrame(time.format(f));
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
