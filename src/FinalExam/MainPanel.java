package FinalExam;

import GUI.IOPanel;
import Utility.MyArrays;
import Utility.Util;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MainPanel extends JPanel {
    JTextField input;
    JTextArea output;
    //MainPanel Constructor
    public MainPanel() {
        //header
        JLabel header = new JLabel("Final Exam Part 2");
        header.setFont(new Font("Times New Roman", Font.BOLD, 40));
        add(header);


        //construct the input and
        input = new JTextField(20);
        input.setFont(new Font("Comic Sans MS", Font.BOLD, 18 ));
        input.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1),"Input"));
        add(input);

        //construct the output panel
        output = new JTextArea(4,20);
        output.setFont(new Font("Comic Sans MS", Font.BOLD, 18 ));
        output.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1),"Output"));
        add(output);

        //add the stats button
        JButton stats = new JButton("Stats");

//        double [] nums = input.getText();
//        public double [] toDouble(){
        String s = input.getText().replaceAll(",", "");
        double x = Double.parseDouble(s);
        double [] nums = new double[s.length()];
        for (int i = 0; i < s.length(); i++){
                nums[i] = s.charAt(i);
        }


        stats.addActionListener( e -> output.setText("Min: " + MyArrays.min(nums) + "\t" + "Max: " + MyArrays.max(nums) + "\t" + "Avg: " + MyArrays.mean(nums) + "\t" + "Median: " + MyArrays.median(nums)));
        add(stats);



    }//MainPanel
}
