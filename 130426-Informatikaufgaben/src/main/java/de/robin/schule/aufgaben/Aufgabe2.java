package de.robin.schule.aufgaben;

import javax.swing.*;
import java.awt.*;


public class Aufgabe2 extends JFrame{
    public static JCheckBox geschlechtMännlich = new JCheckBox("Männlich");
    public static JCheckBox geschlechtWeiblich = new JCheckBox("Weiblich");
    public static JTextField nameField = new JTextField(10);
    public static JButton button = new JButton("Button");
    public static JLabel lbl = new JLabel("");

    public Aufgabe2(){

        button.addActionListener(e -> {
            checkGeschlecht();
        });

        setLayout(new FlowLayout());
        geschlechtWeiblich.setText("Weiblich?");
        geschlechtMännlich.setText("Männlich?");
        add(geschlechtMännlich);
        add(geschlechtWeiblich);
        add(nameField);
        add(button);
        add(lbl);

        setTitle("Aufgabe 2 - Titel Bestimmer");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    private void checkGeschlecht(){
        boolean männlich = geschlechtMännlich.isSelected();
        boolean weiblich = geschlechtWeiblich.isSelected();
        String name = nameField.getText();
        String geschlecht = männlich ? " geehrter Herr " : (weiblich ? " geehrte Frau " : " Damen und Herren");
        lbl.setText("Sehr" + geschlecht + name);
    }

    public static void main(String[] args) {
        new Aufgabe2();
    }
}
