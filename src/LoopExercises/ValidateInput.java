package LoopExercises;

import Utility.Util;

import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter a temp in F degrees: ");

            //check if the user is going to enter a double
            if (kbd.hasNextDouble())  {
                double f = kbd.nextDouble();
                double c = Util.f2c(f);
                System.out.printf("%.1f\n", c);
                flag = false;
            }
            else {
                System.out.println("Error: Invalid value, enter a decimal number.");
                System.out.printf("You have entered \"%s\".\n", kbd.nextLine());
            }
        } // while loop brace

    }
}
