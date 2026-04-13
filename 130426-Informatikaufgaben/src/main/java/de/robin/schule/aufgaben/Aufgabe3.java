package de.robin.schule.aufgaben;


import javax.swing.*;
import java.awt.*;

public class Aufgabe3 extends JFrame {

    public Aufgabe3() {

        JTextField tfGewicht = new JTextField(5);
        JTextField tfGroesse = new JTextField(5);
        JButton btnBerechnen = new JButton("BMI berechnen");
        JLabel lblAusgabe = new JLabel();
        JTextField tfAlter = new JTextField(5);
        JCheckBox männlich = new JCheckBox("Männlich");
        JCheckBox weiblich = new JCheckBox("Weiblich");


        btnBerechnen.addActionListener(e -> {
            double gewicht = Double.parseDouble(tfGewicht.getText());
            double groesse = (Double.parseDouble(tfGroesse.getText())) / 100;
            double alter = Double.parseDouble(tfAlter.getText());

            double bmi = gewicht / (groesse * groesse);

            boolean geschlechtWeiblich = weiblich.isSelected();
            boolean geschlechtMännlich = männlich.isSelected();



            lblAusgabe.setText("BMI: " + String.format("%.2f", bmi) + " → " + checkBMI(alter,bmi,geschlechtMännlich,geschlechtWeiblich));
        });

        setLayout(new FlowLayout());
        add(new JLabel("Gewicht (kg):"));
        add(tfGewicht);
        add(new JLabel("Größe (cm):"));
        add(tfGroesse);
        add(new JLabel("Alter:"));
        add(tfAlter);
        add(btnBerechnen);
        add(männlich);
        add(weiblich);
        add(lblAusgabe);


        setTitle("BMI Rechner");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private static String checkBMI(double alter, double bmi,boolean geschlechtMännlich, boolean geschlechtWeiblich){
        if (geschlechtWeiblich)
            if (alter <= 10){
                if (bmi < 14.3) {
                    return "Untergewicht";
                } else if (bmi < 20.7) {
                    return "Normalgewicht";
                } else if (bmi < 23.4) {
                    return  "Übergewicht";
                } else {
                    return  "Adipositas";
                }
            } else if (alter < 65) {
                if (bmi < 19) {
                    return  "Untergewicht";
                } else if (bmi < 25) {
                    return  "Normalgewicht";
                } else if (bmi <= 30) {
                    return  "Übergewicht";
                } else {
                    return  "Adipositas";
                }
            }
            else {
                if (bmi < 25) {
                    return  "Untergewicht";
                } else if (bmi < 31) {
                    return  "Normalgewicht";
                } else if (bmi < 34) {
                    return  "Übergewicht";
                } else {
                    return  "Adipositas";
                }
            }
        else if (geschlechtMännlich){
            if (alter <= 10){
                if (bmi < 14.7) {
                    return  "Untergewicht";
                } else if (bmi < 21.3) {
                    return  "Normalgewicht";
                } else if (bmi < 24.9) {
                    return  "Übergewicht";
                } else {
                    return  "Adipositas";
                }
            } else if (alter < 65) {
                if (bmi < 20) {
                    return  "Untergewicht";
                } else if (bmi < 26) {
                    return  "Normalgewicht";
                } else if (bmi <= 30) {
                    return  "Übergewicht";
                } else {
                    return  "Adipositas";
                }
            }
            else {
                if (bmi < 24) {
                    return "Untergewicht";
                } else if (bmi < 30) {
                    return  "Normalgewicht";
                } else if (bmi < 33) {
                    return  "Übergewicht";
                } else {
                    return  "Adipositas";
                }
            }
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        new Aufgabe3();
    }
}