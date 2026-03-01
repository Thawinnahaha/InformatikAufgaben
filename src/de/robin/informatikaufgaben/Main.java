package de.robin.informatikaufgaben;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Aufgabe 1 - Alkohol-Alter", "Aufgabe 2 - BMI Rechner"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Wählen Sie eine Aufgabe:",
            "Informatik Aufgaben",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (choice == 0) {
            new Aufgabe1();
        } else if (choice == 1) {
            new Aufgabe2();
        }
    }
}