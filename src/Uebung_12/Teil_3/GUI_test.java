package Uebung_12.Teil_3;

import javax.swing.*;
import java.awt.*;

public class GUI_test  extends JFrame {

    public static void main(String[] args) {
        GUI_test gedeg = new GUI_test();
    }

    public GUI_test() {
        erstelleGUI();
    }

    public void erstelleGUI() {
        this.setLayout(new FlowLayout());

        JButton button = new JButton("i bin a button");

        add(button);
        add(new JTextField("un Text Feldo"));
        add(new JLabel("un Labelle"));
        pack();
        setVisible(true);

        button.addActionListener(event -> {System.out.println("le buton wurde gedrückert");});
    }
}
