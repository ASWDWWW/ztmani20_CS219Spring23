package CS250;

import java.util.Scanner;
import java.util.Calendar;

public class birthday {
    public static void main(String[] args) {
        //initate the scanner from keyboard input
        Scanner kbd = new Scanner(System.in);
        //Ask for the day and print a new ln
        System.out.println("Please enter today's date:");
        //ask for the month
        System.out.print("What is the month (1-12)? ");
        //store the input
        int month = kbd.nextInt();
        //ask for the day
        System.out.print("What is the day (1-31)? ");
        //store the day
        int day = kbd.nextInt();
        //incorrect formula for day of the year because i dont not know how to account for months w/o 31 days
        int specific_day = 31 * (month - 1) + day;
        //print the month day, specific day of the year and the number of total days of the year
        System.out.printf("%s/%s is the %s day of 365", month, day, specific_day);

    }
}
