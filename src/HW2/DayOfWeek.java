package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static Integer dayofweek(int month, int day, int years) {
        // computation for day of the week from moth day and year entered
        int y0 =  years - (14 - month)/12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12* ((14 - month) / 12) - 2;

        int d0 = (day + x + 31*m0 / 12) % 7;

        //return the day of the week corresponding to 1-7
        return d0;

    }

    public static void main(String[] args) {
        //Read computer input for temp and wind vel from user
        Scanner kbd =new Scanner(System.in);
        //prompt before and then read the month
        System.out.print("Enter month 1-12: ");
        int month = kbd.nextInt();
        //prompt before and then read the month
        System.out.print("Enter day 1-31: ");
        int day = kbd.nextInt();
        //prompt before and then read the year
        System.out.print("Enter full year xxxx: ");
        int year = kbd.nextInt();
        //print of the return of dayofweek function
        System.out.print(dayofweek(month, day, year));
    }
}
