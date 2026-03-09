package de.robin.informatikaufgaben;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Aufgabe1 extends JFrame {

    private ImageIcon milchIcon;
    private ImageIcon whiskeyIcon;

    public Aufgabe1() {
        // Load images from src/resources/images/
        URL milchURL = getClass().getResource("/resources/images/milch.jpeg");
        URL whiskeyURL = getClass().getResource("/resources/images/whiskey.jpeg");

        if (milchURL == null || whiskeyURL == null) {
            System.out.println("Bild nicht gefunden");
            milchIcon = new ImageIcon();
            whiskeyIcon = new ImageIcon();
        } else {
            milchIcon = new ImageIcon(milchURL);
            whiskeyIcon = new ImageIcon(whiskeyURL);
        }

        SpinnerNumberModel model = new SpinnerNumberModel(18, 0, 120, 1);
        JSpinner spinnerAlter = new JSpinner(model);

        JButton btnOK = new JButton("OK");
        JLabel lblText = new JLabel();
        JLabel lblBild = new JLabel();

        btnOK.addActionListener(e -> {
            int alter = (Integer) spinnerAlter.getValue();

            if (alter < 18) {
                lblText.setText("Du darfst noch keinen harten Alkohol trinken.");
                lblBild.setIcon(milchIcon);
            } else {
                lblText.setText("Du darfst harten Alkohol trinken.");
                lblBild.setIcon(whiskeyIcon);
            }
        });

        setLayout(new FlowLayout());
        add(spinnerAlter);
        add(btnOK);
        add(lblText);
        add(lblBild);

        setTitle("Aufgabe 1 - Alkohol-Alter");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aufgabe1();
    }
}