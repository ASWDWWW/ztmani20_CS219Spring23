package Day3;

import Utility.Util;

import java.util.Scanner;

public class Windchill {
    public static void main(String[] args) {
        //Read computer input for temp and wind vel from user

        Scanner kbd =new Scanner(System.in);
        //prompt before and then read the temp
        System.out.print("Enter a temp (F): ");
        double temp = kbd.nextDouble();
        //prompt before and then read the vel
        System.out.print("Enter a vel (MPH): ");
        double vel = kbd.nextDouble();

        //System.out.println(Util.windchill(temp,vel));

        //formatted print
        System.out.printf("The windchill is %.1f for a temperature of %.1f and windchill velocity %.1f\n",
                Util.windchill(temp,vel), temp, vel);
    }
}
