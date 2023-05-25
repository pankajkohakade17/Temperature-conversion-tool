package TemperatureConverterTool;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterAdvance extends JFrame implements ActionListener {
    private JTextField fahrenheitField;
    private JTextField celsiusField;
    private JButton convertToFButton;
    private JButton convertToCButton;

    public TemperatureConverterAdvance() {
        // Set up the frame
        super("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);

        // Create the input fields
        fahrenheitField = new JTextField(10);
        celsiusField = new JTextField(10);
        celsiusField.setEditable(false);

        // Create the buttons
        convertToFButton = new JButton("Convert to Fahrenheit");
        convertToFButton.addActionListener(this);
        convertToCButton = new JButton("Convert to Celsius");
        convertToCButton.addActionListener(this);

        // Create the layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add the input fields to the layout
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(new JLabel("Fahrenheit: "), constraints);
        constraints.gridx = 1;
        panel.add(fahrenheitField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(new JLabel("Celsius: "), constraints);
        constraints.gridx = 1;
        panel.add(celsiusField, constraints);
        // Add the buttons to the layout
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(convertToFButton, constraints);
        constraints.gridx = 1;
        panel.add(convertToCButton, constraints);

        // Add the panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }
    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertToFButton) {
            try {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                fahrenheitField.setText(String.format("%.2f", fahrenheit));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid Celsius temperature.");
            }
        } else if (e.getSource() == convertToCButton) {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                celsiusField.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid Fahrenheit temperature.");
            }
        }
    }

    public static void main(String[] args) {
        new TemperatureConverterAdvance();
    }
}
