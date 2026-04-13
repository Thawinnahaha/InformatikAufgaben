package de.robin.twodengine;

import de.robin.twodengine.aufgaben.Aufgabe1;
import de.robin.twodengine.aufgaben.Aufgabe2;
import de.robin.twodengine.aufgaben.Aufgabe3;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] options = {"Aufgabe 1 - Auto oder anderes", "Aufgabe 2 - Titel", "Aufgabe 3 - BMI erweitert"};
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
        } else if (choice == 2) {
            new Aufgabe3();
        }
    }
}