package week8_hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HelloGUI extends JFrame {
    private JPanel mainPanel;       // holds many components together
    private JButton clickMeButton;      // our button component
    private JLabel myFirstLabel;        // our label component

    HelloGUI() {        // our hellogui() constructor
        setContentPane(mainPanel);      // we will work within our mainPanel, holds components together

        setPreferredSize(new Dimension(500, 500));      // sets preferred dimensions of form
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // sets our form to exit upon closing window

        clickMeButton.addActionListener(new ActionListener() {      // our button needs an action listener
            @Override
            public void actionPerformed(ActionEvent e) {        // our button needs an action event
                // code here - this will run when button is clicked.
                myFirstLabel.setText("Hello GUI Programmers!!!");       // this will set our form label as this text
            }       // end of action event
        });     // end of action listener
    }       // end of HelloGui constructor

    public static class Main {

        public static void main(String[] args) {        // our main method

            HelloGUI gui = new HelloGUI();      // initiates our GUI form
        }       // end of main method
    }       // end of public class Main
}       // end of hellogui public class
