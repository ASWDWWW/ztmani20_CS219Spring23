package FinalExam;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //setup interface
        JFrame frame = new JFrame("CS219 Final Exam");
        //Units of width and height is in pixels
        frame.setSize(350,400);
        //Dont set the layout
        //let the top level JPanel do it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainPanel());
        frame.setVisible(true);
    }
}
