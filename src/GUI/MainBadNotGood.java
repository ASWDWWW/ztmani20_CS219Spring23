package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainBadNotGood implements ActionListener {
    JTextArea input, output;
    public static void main(String[] args) {
        MainBadNotGood m = new MainBadNotGood();
        m.go();
    }

    private void go(){
        //setup interface
        JFrame frame = new JFrame("CS219 Text Processor");
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //header
        JLabel header = new JLabel("CS219 Text Processor");
        header.setFont(new Font("Times New Roman", Font.BOLD, 30));
        header.setBackground(Color.BLUE);
        header.setOpaque(true);
        frame.add(header);

        //input panel
        //combine labe//text area into a JPanel
        JPanel input_panel = new JPanel();
        //input label
        JLabel input_label = new JLabel("input");
        input_panel.add(input_label);
        //make input text area
        input = new JTextArea(10,60);
        input.setFont(new Font("Arial",Font.PLAIN,20));
        input_panel.add(input);
        frame.add(input_panel);

        //output panel
        JPanel output_panel = new JPanel();
        //output label
        JLabel output_label = new JLabel("output");
        output_panel.add(output_label);
        //make output text area
        output = new JTextArea(10,60);
        output.setFont(new Font("Arial",Font.PLAIN,20));
        output_panel.add(output);
        frame.add(output_panel);

        //Add a button to the bottom
        JButton submit = new JButton("submit");
        submit.setBackground(Color.YELLOW);
        submit.addActionListener(this);
        frame.add(submit);


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = input.getText().toUpperCase();
        output.setText(s);
    }
}
