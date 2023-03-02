package Exam1Corrected;

import java.util.Scanner;

public class Exam1 {
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }
    }

    public static int validate(Scanner kbd) {
        int x = 0;
        System.out.print("Enter an integer: ");
        boolean flag = true;
        while (flag) {
            System.out.print("Enter an integer: ");

            //check if the user is going to enter a integer
            if (kbd.hasNextInt()) {
                x = kbd.nextInt();
                if (x >= 0) {
                    flag = false;
                } else {
                    System.out.println("Error: Invalid value, enter an integer number greater than 0.");
                    System.out.println("You have entered" + x);
                }
            } else {
                System.out.println("Error: Invalid value, enter an integer number.");
                System.out.printf("You have entered \"%s\".\n", kbd.nextLine());
            }
        } // while loop brace

        return x;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int x = validate(kbd);
        printTriangle(x);
    }
}