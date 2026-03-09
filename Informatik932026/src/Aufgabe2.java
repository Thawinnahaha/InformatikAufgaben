
import javax.swing.*;
import java.awt.*;

public class Aufgabe2 {
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
            int input = Integer.parseInt(inputField.getText());
            if (input > 100){
                outputField.setText("Not Valid");
            } else if (input >= 90) {
                outputField.setText("seht gut");
            } else if (input >=75) {
                outputField.setText("gut");
            } else if (input >= 60) {
                outputField.setText("befriedigend");
            } else if (input>=50) {
                outputField.setText("ausreichend");
            } else {
                outputField.setText("nicht bestanden");
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