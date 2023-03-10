package HW4;

import Utility.Util;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double c = getValidInvestment(kbd);
        double r = getValidInterestRate(kbd);
        double t = getValidNumberOfYears(kbd);
        int n = getValidCompund(kbd);
        System.out.println(Util.investment(c,r,t,n));
    }


    public static double getValidInvestment(Scanner kbd) {
        int i = 1;
        while (i == 1) {
            System.out.print("Enter the initial investment value: ");
            if (kbd.hasNextDouble()) {
                double c = kbd.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: Initial investment should be greater than zero. You entered: %.1f\n", c);
                }
                else {
                    System.out.printf("Initial Investment: %.1f\n", c);
                    System.out.println();
                    i = 0;
                    return c;
                }
            }
            else {
                String d = kbd.next();
                System.out.println("Error: Initial investment should be a valid number. You entered: " + d);
            }
        }
        return 0;
    }

    public static double getValidInterestRate(Scanner kbd) {
        int i = 2;
        while (i == 2) {
            System.out.print("Enter the investment rate: ");

            if (kbd.hasNextDouble()) {
                double c = kbd.nextDouble();
                if (c < 0 || c > 1) {
                    System.out.printf("Error: Investment rate should be between 0-1. You entered: %.1f\n", c);
                }
                else {
                    System.out.printf("Investment rate: %,1f\n", c);
                    System.out.println();
                    i = 0;
                    return c;
                }
            }
            else {
                String d = kbd.next();
                System.out.println("Error: Investment rate should be a valid number. You entered: " + d);
            }
        }
        return 0;
    }

    public static double getValidNumberOfYears(Scanner kbd){
        int i = 3;
        while (i == 3) {
            
            System.out.print("Enter the Investment time: ");
            if (kbd.hasNextDouble()) {
                double c = kbd.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: Investment time should be greater than zero. You entered: %.1f\n", c);
                }
                else {
                    System.out.printf("Investment time: %.1f\n", c);
                    System.out.println();
                    i = 0;
                    return c;
                }
            }
            else {
                String d = kbd.next();
                System.out.println("Error: Investment time should be a valid number. You entered: " + d);

            }
        }
        return 0;
    }
    public static int getValidCompund(Scanner kbd){
        int i = 4;
        while (i == 4) {
            System.out.print("Enter the have many year to compound investment: ");

            if (kbd.hasNextInt()) {
                int c = kbd.nextInt();
                if (c < 0) {
                    System.out.println("Error: Compounded years should be greater than zero. You entered: " + c);
                }
                else {
                    System.out.println("Investment rate: " + c);
                    System.out.println();
                    i = 0;
                    return c;
                }
            }
            else {
                String d = kbd.next();
                System.out.println("Error: Compounded years should be a valid number. You entered: " + d);
            }
        }
        return i;
    }


}
