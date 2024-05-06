package week8_hello_gui_app.movie_gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame {
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    MovieGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400,300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        configureEventHandlers();
    }

    private void configureEventHandlers(){
        ratingSlider.addChangeListener(new ChangeListener() {       // we need a change listener for our slider
            @Override
            public void stateChanged(ChangeEvent e) {       // changeevent changes if our user changes input on slider
                String valueLabelText = ratingSlider.getValue() + " stars.";        //
                sliderValueLabel.setText(valueLabelText);       // sets our text for our user. shows their own rating.
                updateOpinion();        // use updateOpinion method here
            }       // end of change event constructor
        });     // end of change listener for slider in GUI form

        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {      // new change listener for checkbox
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }   // updates our movie gui form
        });

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {  // add documentListener...
            // for our movie title text field.
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // ignore this one
            }
        });

        quitButton.addActionListener(new ActionListener() {     // need action listener for our quit button...
            @Override
            public void actionPerformed(ActionEvent e) {        // define what happens when we click quitButton...

                int quit = JOptionPane.showConfirmDialog(MovieGUI.this,
                        "Are you sure you want to quit?", "Quit", JOptionPane.OK_CANCEL_OPTION);
                // ask user for confirmation to quit form
                if (quit == JOptionPane.OK_OPTION) {        // if user clicks ok_option
                    dispose();          // quit the gui form
                }       // end of if statement

//                if (JOptionPane.showConfirmDialog(MovieGUI.this,
//                        "Are you sure you want to quit?", "Quit", JOptionPane.OK_CANCEL_OPTION) ==
//                        JOptionPane.OK_OPTION) {
//                    dispose();
//                }
            }       // end of action event
        });     // end of action listener
    }       // end of configure event handlers

    private void updateOpinion() {      // our public updateOpinion() method updates our program to what the user inputs
        // todo finish this
        String movieName = movieTitleTextField.getText().strip();       // movieName is our user input in text field

        if (movieName.isEmpty()) {      // if user does not enter movie name,
            movieOpinionLabel.setText("Movie opinion");     // handle empty movie titles here.
            return;     // stop gui form here
        } else {        // if-else statement, if movieName is not empty...
            int rating = ratingSlider.getValue();       // set "rating" variable from our ratingSlider component.
            boolean seeAgain = wouldSeeAgainCheckBox.isSelected();      // set "seeAgain" from wouldSeeAgainCheckBox

            String template = "You rated %s %d stars. You %s see again.";
            // our formatted template for displaying information to our user

//        String seeAgainString = "would";
//        if (!seeAgain == false) {
//            seeAgainString = "would not";;
//        }
            // alternative below - ternary operator, setting values based on condition

            String seeAgainString = (seeAgain) ? "would" : "would not";     // set values based on condition

            String opinion = String.format(template, movieName, rating, seeAgainString);
            // all of our values come together to create our users "opinion" variable, this will be our result for user.

            movieOpinionLabel.setText(opinion);     // set our movieOpinionLabel based on our user input
        }       // end of if else block
    }       // end of updateOpinion() method
}       // end of public class MovieGUI

