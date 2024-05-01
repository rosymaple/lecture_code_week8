package week8_hello_gui_app.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel eurosResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private double dollarsToEurosExchangeRate = 0.84;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);


    CurrencyConverter() {
        setContentPane(mainPanel);
        pack();
        setPreferredSize(new Dimension(500, 300));
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in JTextField?


                try {
                    String dollarString = dollarsTextField.getText();
                    // convert to a number
                    double dollars = Double.parseDouble(dollarString);      // TODO handle exceptions
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);

                    // convert to target currency
                    double convertedValue = dollars * exchangeRate;

                    // display result in euroResultLabel jLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f Euros",
                            dollars, convertedValue);

                    eurosResultLabel.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter a " +
                            "number without any $ or other symbols.");
                }
            }
        });
    }
}
