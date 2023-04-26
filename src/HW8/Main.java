package HW8;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import java.util.Scanner;

public class Main extends WeatherObervation{

    public Main(double temperature, double windspeed, double humidity, String cloudcover) {
        super(temperature, windspeed, humidity, cloudcover);
    }

    public static void main(String[] args) {
        System.out.println("CS219 HW8 Weather App");
        System.out.println("Type \"quit\" to end the program.");
        ZipCodeDB db = new ZipCodeDB();
        db.load();
        boolean flag = true;
        while (flag){
            System.out.print("Enter a zip code> ");
            Scanner kbd = new Scanner(System.in);
            String zip = kbd.nextLine();
            if (!zip.equals("quit")) {
                ZipCode code = db.findByZip(zip);
                if (code == null) {
                    System.out.println("invalid zipcode.");
                }
                else {
                    WeatherClient wc = new WeatherClient();
                    WeatherObervation w = wc.getWeather(code);
                    String city = code.getCity();
                    String state = code.getState();
                    double temp = w.getTemperature();
                    double windspeed = w.getWindspeed();
                    double humidity = w.getHumidity();
                    String cloudcover = w.getCloudcover();
                    System.out.println("The temperature in " + city + ", " + state + " is " + temp + " degrees fahrenheit Wind speed is " + windspeed + " Knots, humidity " + humidity + "% Cloud cover: " + cloudcover);
                    String q = "quit";
                    System.out.println("Type " + q + " to end the program.");
                }
            }
            else {
                flag = false;

            }


        }
        }

}

