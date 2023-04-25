package HW8;

import Utility.Util;
import ZipCodes.ZipCode;

import java.util.Scanner;

public class WeatherClient implements WeatherClientInterface{


    @Override
    public WeatherObervation getWeather(ZipCode code) {
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        Scanner s = Util.openSite(path);
        if (s != null) {
            return null;
        }
        else {
            double temp = ;
            double windspeed = ;
            double humidity = ;
            String cloudcover = ;
            WeatherObervation w = new WeatherObervation(temp, windspeed, humidity, cloudcover);
            return w;
        }

    }
}

