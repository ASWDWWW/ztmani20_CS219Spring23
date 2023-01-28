package CS250;

import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter today's date:");
        System.out.print("What is the month (1-12)? ");
        int month = kbd.nextInt();
        System.out.print("What is the day (1-31)? ");
        int day = kbd.nextInt();
        System.out.printf("%s/%s is day of 365", month, day);

    }
}
