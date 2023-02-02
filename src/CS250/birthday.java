package CS250;

import java.util.Scanner;
import java.util.Calendar;

public class birthday {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter today's date:");
        System.out.print("What is the month (1-12)? ");
        int month = kbd.nextInt();
        System.out.print("What is the day (1-31)? ");
        int day = kbd.nextInt();
        int specific_day = 31 * (month - 1) + day;
        System.out.printf("%s/%s is the %s day of 365", month, day, specific_day);

    }
}
