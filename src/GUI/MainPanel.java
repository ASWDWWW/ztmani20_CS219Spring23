package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JPanel is a superclass and baseclass
public class MainPanel extends JPanel {
    IOPanel input, output;
    //MainPanel Constructor
    public MainPanel() {
        //header
        JLabel header = new JLabel("CS219 Text Processor");
        header.setFont(new Font("Times New Roman", Font.BOLD, 40));
        header.setBackground(Color.cyan);
        header.setOpaque(true);
        add(header);

        //construct the input panel
        input = new IOPanel("input");
        add(input);
        //construct the output panel
        output = new IOPanel("output");
        add(output);

        //add the toUpper button
        JButton toUpper = new JButton("TO Upper");
        //the current class implements the ActionListener
//        toUpper.addActionListener(new UpperButtonHandler());
        //making functions with no names
        toUpper.addActionListener( e -> output.setText(input.getText().toUpperCase()));
        add(toUpper);
        //add the toLower button
        JButton toLower = new JButton("TO Lower");
        //the current class implements the ActionListener
//        toLower.addActionListener(new LowerButtonHandler());
        //making functions with no names
        toLower.addActionListener( e -> output.setText(input.getText().toLowerCase()));
        add(toLower);

    }//MainPanel


}//MainPanel class
