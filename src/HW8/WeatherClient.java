package HW8;

import Utility.Util;
import ZipCodes.ZipCode;

import java.util.Scanner;

public class WeatherClient implements WeatherClientInterface {


    @Override
    public WeatherObervation getWeather(ZipCode code) {
        String cloudcover = "";
        double humidity = 0;
        double windspeed = 0;
        double temperature = 0;

        String lat = String.valueOf(code.getCoord().getLat());
        String lng = String.valueOf(code.getCoord().getLng());
        String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=" + lat + "&lng=-" + lng + "&username=edharcourt";
        Scanner s = Util.openSite(path);
        if (s == null) {
            return null;
        }
        while (s.hasNextLine()) {
            if (s.hasNext("clouds")) {
                String cl = s.toString();
                cloudcover = cl.substring(10, cl.length() - 2);
            } else {
                cloudcover = "n/a";
            }
            if (s.hasNext("tempature")) {
                temperature = s.nextDouble();
            }
            if (s.hasNext("humidity")) {
                humidity = s.nextDouble();
            }
            if (s.hasNext("windSpeed")) {
                windspeed = s.nextDouble();
            }

        }
        return new WeatherObervation(temperature, windspeed, humidity, cloudcover);
    }
}

