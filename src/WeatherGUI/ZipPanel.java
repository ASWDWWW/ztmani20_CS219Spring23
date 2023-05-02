package WeatherGUI;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZipPanel extends JPanel implements ActionListener {
    ZipCodeDB db;
    JTextField zipfield;

    JTextArea output;
    public ZipPanel(ZipCodeDB db, JTextArea output) {
        this.db = db;
        this.output = output;


        JLabel ziplabel = new JLabel("Zipcode");
        ziplabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(ziplabel);

        this.zipfield = new JTextField(10);
        add(zipfield);

        JButton submit = new JButton("Submit");
        submit.setBackground(Color.green);
        submit.addActionListener(this);
        add(submit);
//        .addActionListener( e -> output.setText(input.getText().toUpperCase()));
//        add(toUpper);

        setBorder(new LineBorder(Color.BLUE, 2 , true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ZipCode zc = db.findByZip(zipfield.getText());
        output.setText(zc.toString());
    }
}
