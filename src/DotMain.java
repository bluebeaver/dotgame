import javax.swing.*;
import java.awt.*;



public class DotMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Dots");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700, 700));

        JPanel pan = new DotPanel();
        frame.add(pan);
        frame.pack();
        frame.setVisible(true);

    }

}

