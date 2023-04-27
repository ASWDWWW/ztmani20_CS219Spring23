package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //setup interface
        JFrame frame = new JFrame("CS219 Fancy App");
        //Units of width and height is in pixels
        frame.setSize(1100,800);
        //Dont set the layout
        //let the top level JPanel do it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainPanel());
        frame.setVisible(true);
    }

}
