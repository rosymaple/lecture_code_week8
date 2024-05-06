package week8_hello_gui_app.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;        // these are all variables in our GUI form
    private JButton convertButton;              // different Jfunctions in our GUI form need to be added...
    private JLabel eurosResultLabel;            // we need to label our GUI functions...
    private JPanel mainPanel;                   // JPanels are used to hold and group components together...
    private JComboBox<String> currencyComboBox; // a drop down list panel...

    private double dollarsToEurosExchangeRate = 0.84;       // our exchange rate variable for dollars to euros

    private final String EUROS = "Euros";       // final variable string Euros
    private final String POUNDS = "Pounds";     // final variable string Pounds

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);
    // creating a map.of string and double variables, our EUROS or POUNDS vs their exchange rate (% out of 100)


    CurrencyConverter() {
        setContentPane(mainPanel);
        pack();
        setPreferredSize(new Dimension(500, 300));      // set specific dimensions for our GUI form
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // good to add this for exiting the GUI form

        getRootPane().setDefaultButton(convertButton);      // our default button used in our form

        currencyComboBox.addItem(EUROS);        // add String to drop down list
        currencyComboBox.addItem(POUNDS);       // add String to drop down list

        convertButton.addActionListener(new ActionListener() {      // we need an action listener for every button
            @Override
            public void actionPerformed(ActionEvent e) {        // initialize action event for our button
                // what was typed in JTextField?


                try {       // try-catch block for handling numberformatexceptions
                    String dollarString = dollarsTextField.getText();       // this is our user input "dollarString"
                    // convert to a number
                    double dollars = Double.parseDouble(dollarString);      // TODO handle exceptions
                    String toCurrency = (String) currencyComboBox.getSelectedItem();    // toCurrency is user input...
                    // from currencycombobox drop down list

                    double exchangeRate = exchangeRates.get(toCurrency);
                    // use exchangeRates method on toCurrency chosen from the drop down list

                    // convert to target currency
                    double convertedValue = dollars * exchangeRate;     // this variable performs an equation

                    // display result in euroResultLabel jLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f Euros",
                            dollars, convertedValue);       // formatted String for our user

                    eurosResultLabel.setText(resultString);     // set our eurosResultLabel to resultString variable
                } catch (NumberFormatException nfe) {       // catch block for our try-catch block
                    JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter a " +
                            "number without any $ or other symbols.");      // print error message for our user
                }       // end of try-catch block
            }       // end of action event
        });     // end of action listener for convertButton in our GUI form
    }       // end of CurrencyConverter() constructor
}       // end of public class CurrencyConverter
