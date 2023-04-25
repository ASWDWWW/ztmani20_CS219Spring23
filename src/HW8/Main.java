package HW8;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("Enter a 5 digit zipcod: ");
            Scanner kbd = new Scanner(System.in);
            if (kbd.hasNextDouble()) {
                ZipCode code = new ZipCode(kbd);
                WeatherClient c = new WeatherClient(kbd);
            }
            else {
                System.out.println("invalid zipcode.");
            }
            ZipCode code = new ZipCode(kbd);
            WeatherClient w = new WeatherClient(zipcode);
        }
        }

}

