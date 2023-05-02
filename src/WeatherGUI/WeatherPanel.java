package WeatherGUI;

import HW8.WeatherObervation;
import ZipCodes.ZipCodeDB;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class WeatherPanel extends JPanel {
    public WeatherPanel(ZipCodeDB db){
        JLabel header = new JLabel("CS219 Weather App");
        header.setFont(new Font("Times New Roman",Font.BOLD, 40));
        header.setBackground(Color.gray);
        header.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        header.setOpaque(true);
        add(header);

        JTextArea output = new JTextArea(4,20);
        output.setFont(new Font("Comic Sans MS", Font.BOLD, 18 ));
        output.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1),"Weather Data"));

        output.setLineWrap(true);
        add(new ZipPanel(db, output));
        add(output);



    }


}
