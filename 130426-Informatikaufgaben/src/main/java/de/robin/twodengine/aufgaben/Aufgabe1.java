package de.robin.twodengine.aufgaben;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Aufgabe1 extends JFrame {

    public static SpinnerNumberModel model = new SpinnerNumberModel(18, 0, 120, 1);
    public static JSpinner spinnerAlter = new JSpinner(model);
    public static JCheckBox checkBox = new JCheckBox();
    public static JButton btnOK = new JButton("OK");
    public static JLabel lblText = new JLabel();
    public static JLabel lblBild = new JLabel();
    public static JCheckBox führerschein = new JCheckBox("Führerschein?");


    public Aufgabe1() {

        btnOK.addActionListener(e -> {
            checkAlter();
        });

        setLayout(new FlowLayout());
        checkBox.setText("Complex?");
        add(führerschein);
        add(spinnerAlter);
        add(btnOK);
        add(checkBox);
        add(lblText);
        add(lblBild);

        setTitle("Aufgabe 1 - Alkohol-Alter");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static void checkAlter(){
        int alter = (Integer) spinnerAlter.getValue();
        boolean complex = checkBox.isSelected();
        if (complex) {
            if (alter >= 18 && führerschein.isSelected()) {
                lblText.setText("Du darfst Auto fahren!");

            } else if (alter < 3) {
                lblText.setText("Du darfst Bobbycar fahren!");

            } else if (alter < 6) {
                lblText.setText("Du darfst Roller fahren!");
            } else {
                lblText.setText("Du darfst Fahrrad fahren!");
            }
        }
        else{
            if (alter < 18 || !führerschein.isSelected()){
                lblText.setText("Du darfst Fahrrad fahren");
            }
            else {
                lblText.setText("Du darfst Auto fahren!");
            }
        }
    }

    public static void main(String[] args) {
        new Aufgabe1();
    }
}