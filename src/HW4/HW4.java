package HW4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double c = validateInvestmentInitial(kbd);
        double r = validateInvestmentRate(kbd);
        double t = validateInvestmentTime(kbd);
        double n = validateInvestmentYears(kbd);

    }

    public static double validateInvestmentInitial(Scanner kbd) {
        double i = 1;
        while (i == 1) {
            System.out.print("Enter the initial investment value: ");
            double c = kbd.nextDouble();
            if (kbd.hasNextDouble()) {
                if (c < 0) {
                    System.out.printf("Error: Initial investment should be greater than zero. You entered: %f\n", c);
                }
                else {
                    System.out.printf("Initial Investment: %f\n", c);
                    i = 0;
                }
            }
            else {
                System.out.printf("Error: Initial investment should be a valid number. You entered: %f\n", c);
            }
        }
        return i;
    }

    public static double validateInvestmentRate(Scanner kbd) {
        double i = 2;
        while (i == 2) {
            System.out.print("Enter the investment rate: ");
            double c = kbd.nextDouble();
            if (kbd.hasNextDouble()) {
                if (c < 0) {
                    System.out.printf("Error: Investment rate should be greater than zero. You entered: %f\n", c);
                }
                else {
                    System.out.printf("Investment rate: %f\n", c);
                    i = 0;
                }
            }
            else {
                System.out.printf("Error: Investment rate should be a valid number. You entered: %f\n", c);
            }
        }
        return i;
    }

    public static double validateInvestmentTime(Scanner kbd){
        double i = 3;
        while (i == 3) {
            System.out.print("Enter the Investment time: ");
            double c = kbd.nextDouble();
            if (kbd.hasNextDouble()) {
                if (c < 0) {
                    System.out.printf("Error: Investment time should be greater than zero. You entered: %f\n", c);
                }
                else {
                    System.out.printf("Investment time: %f\n", c);
                    i = 0;
                }
            }
            else {
                System.out.printf("Error: Investment time should be a valid number. You entered: %f\n", c);
            }
        }
        return i;
    }
    public static int validateInvestmentYears(Scanner kbd){
        int i = 4;
        while (i == 4) {
            System.out.print("Enter the have many year to compound investment: ");
            int c = kbd.nextInt();
            if (kbd.hasNextInt()) {
                if (c < 0) {
                    System.out.printf("Error: Compounded years should be greater than zero. You entered: %f\n", c);
                }
                if (c < 0) {
                    System.out.printf("Error: Compounded years should be greater than zero. You entered: %f\n", c);
                }
                else {
                    System.out.printf("Investment rate: %f\n", c);
                    i = 0;
                }
            }
            else {
                System.out.printf("Error: Compounded years should be a valid number. You entered: %f\n", c);
            }
        }
        return i;
    }


}
