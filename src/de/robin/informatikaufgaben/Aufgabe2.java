package de.robin.informatikaufgaben;

import javax.swing.*;
import java.awt.*;

public class Aufgabe2 extends JFrame {

    public Aufgabe2() {

        JTextField tfGewicht = new JTextField(5);
        JTextField tfGroesse = new JTextField(5);
        JButton btnBerechnen = new JButton("BMI berechnen");
        JLabel lblAusgabe = new JLabel();

        btnBerechnen.addActionListener(e -> {
            double gewicht = Double.parseDouble(tfGewicht.getText());
            double groesse = (Double.parseDouble(tfGroesse.getText())) / 100;

            double bmi = gewicht / (groesse * groesse);
            String bewertung;

            if (bmi < 18.5) {
                bewertung = "Untergewicht";
            } else if (bmi < 25) {
                bewertung = "Normalgewicht";
            } else if (bmi < 30) {
                bewertung = "Übergewicht";
            } else {
                bewertung = "Adipositas";
            }

            lblAusgabe.setText("BMI: " + String.format("%.2f", bmi) + " → " + bewertung);
        });

        setLayout(new FlowLayout());
        add(new JLabel("Gewicht (kg):"));
        add(tfGewicht);
        add(new JLabel("Größe (cm):"));
        add(tfGroesse);
        add(btnBerechnen);
        add(lblAusgabe);

        setTitle("BMI Rechner");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aufgabe2();
    }
}