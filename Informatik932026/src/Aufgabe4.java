import javax.swing.*;
import java.awt.event.*;

public class Aufgabe4 extends JFrame implements ActionListener {

    JTextField txtBestellwert;
    JCheckBox chkSchueler;
    JButton btnBerechnen;
    JLabel lblErgebnis;

    public Aufgabe4() {

        setTitle("Rabattberechnung Shop");
        setSize(300,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblBestellwert = new JLabel("Bestellwert:");
        lblBestellwert.setBounds(20,20,100,25);
        add(lblBestellwert);

        txtBestellwert = new JTextField();
        txtBestellwert.setBounds(120,20,120,25);
        add(txtBestellwert);

        chkSchueler = new JCheckBox("Schüler");
        chkSchueler.setBounds(120,50,100,25);
        add(chkSchueler);

        btnBerechnen = new JButton("Berechnen");
        btnBerechnen.setBounds(80,80,120,30);
        btnBerechnen.addActionListener(this);
        add(btnBerechnen);

        lblErgebnis = new JLabel("Endpreis: ");
        lblErgebnis.setBounds(20,120,250,25);
        add(lblErgebnis);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double bestellwert = Double.parseDouble(txtBestellwert.getText());
        boolean schueler = chkSchueler.isSelected();

        double rabatt = 0;

        if (bestellwert < 50) {
            rabatt = 0;
        } else if (bestellwert < 100) {
            rabatt = 0.05;
        } else if (bestellwert < 200) {
            rabatt = 0.10;
        } else {
            rabatt = 0.15;
        }

        if (schueler) {
            rabatt += 0.05;
        }

        double endpreis = bestellwert * (1 - rabatt);

        lblErgebnis.setText("Endpreis: " + endpreis + " €");
    }

    public static void main(String[] args) {
        new Aufgabe4();
    }
}