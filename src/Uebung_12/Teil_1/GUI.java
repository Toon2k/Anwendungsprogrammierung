package Uebung_12.Teil_1;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static void main (String [] args) {
        new GUI();
    }

    public GUI() {
        super("ein Fensterchen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setPreferredSize(new Dimension (150, 50));
        panel2.setPreferredSize(new Dimension(150, 50));

        panel1.setBackground(Color.GRAY);
        panel1.setBackground(Color.yellow);

        panel1.add(new JLabel("ein Label"));
        panel2.add(new JTextField("hier Text eingeben"));

        add(panel1);
        add(panel2);

        setSize(600,500);

        setVisible(true);
    }
}
