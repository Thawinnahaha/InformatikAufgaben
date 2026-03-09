
import javax.swing.*;
import java.awt.*;

public class Aufgabe1 {
    public static void main(String[] args) {
// Create the JFrame
        JFrame frame = new JFrame("String to Number Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Input label and text field
        JLabel inputLabel = new JLabel("String:");
        JTextField inputField = new JTextField(20);

        // Convert button
        JButton convertButton = new JButton("Convert to Number");

        // Output label and text field
        JLabel outputLabel = new JLabel("Number:");
        JTextField outputField = new JTextField(20);
        outputField.setEditable(false);

        // Add action listener to button
        convertButton.addActionListener(e -> {
            try {
                String input = inputField.getText();
                // Try to parse as integer first, then as double
                if (input.contains(".")) {
                    double number = Double.parseDouble(input);
                    if (number % 2 == 0){
                        outputField.setText("Even");
                    }else{
                        outputField.setText("Odd");
                    }
                } else {
                    int number = Integer.parseInt(input);

                    if (number % 2 == 0){
                        outputField.setText("Even");
                    }else{
                        outputField.setText("Odd");
                    }}

            } catch (NumberFormatException ex) {
                outputField.setText("Invalid number");
            }
        });

        // Add components to frame
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(convertButton);
        frame.add(outputLabel);
        frame.add(outputField);

        // Make frame visible
        frame.setVisible(true);
    }
}