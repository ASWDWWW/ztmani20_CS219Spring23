package Exam1Practice;

import java.util.Scanner;

public class Exam1Study {
    //public static double f2c(double f) {
        //return 5.0/9.0 * (f - 32);
   // }
    public static void main(String[] args) {
        //System.out.println("Hello World");
       // System.out.printf("%.2f", f2c(211.9));
        Scanner kbd = new Scanner(System.in);
        System.out.println(" Pick an integer");
        int x = kbd.nextInt();
        System.out.println(twoOrSeven(x));
        System.out.println(volume(3, 10));

    }

    public static double volume(double r, double h) {
        double v = 0;
        v = (1./3.) * Math.PI * Math.pow(r, 2) * h;
        return v;

    }

    public static int twoOrSeven(int x) {
        int count = 0;
        while (x != 0) {
            if (x % 10 == 3 || x % 10 == 4 || x % 10 == 5 || x % 10 == 6) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }
}
