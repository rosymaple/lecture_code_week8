package week8_hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HelloGUI extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGUI() {
        setContentPane(mainPanel);

        setPreferredSize(new Dimension(500, 500));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here - this will run when button is clicked.
                myFirstLabel.setText("Hello GUI Programmers!!!");
            }
        });
    }

    public static class Main {

        public static void main(String[] args) {

            HelloGUI gui = new HelloGUI();
        }
    }
}
