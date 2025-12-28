package Uebung_12.Teil_2;

import javax.swing.*;
import java.awt.*;

public class GUI_2 extends JFrame {

    public static void main (String [] args) {
        new GUI_2();
    }

    public GUI_2() {
        super("ein Fensterlein");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        //Label
        JPanel label = new JPanel();
        label.setPreferredSize(new Dimension (150, 50));
        label.setBackground(Color.GREEN);
        label.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        label.add(new JLabel("Eingabe"), gbc);

        //Textfield
        JPanel textfield = new JPanel();
        textfield.setPreferredSize(new Dimension(150, 50));
        textfield.setLayout(new BorderLayout());
        JTextField tf = new JTextField("......");
        tf.setBackground(Color.yellow);
        textfield.add(tf, BorderLayout.CENTER);

        //Button
        JPanel button1 = new JPanel();
        button1.setPreferredSize(new Dimension(150,50));
        button1.setLayout(new BorderLayout());
        button1.add(new JButton("Reset"));

        //obere Reihe
        JPanel topRow = new JPanel();
        topRow.setLayout(new FlowLayout());
        topRow.add(label);
        topRow.add(textfield);

        //untere Reihe
        JPanel bottomRow = new JPanel();
        bottomRow.setLayout(new FlowLayout());
        bottomRow.add(button1);

        add(topRow, BorderLayout.CENTER);
        add(bottomRow, BorderLayout.SOUTH);

        setSize(400,200);

        setVisible(true);
    }
}
