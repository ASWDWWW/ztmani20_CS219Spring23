package HW8;

import Utility.Util;
import ZipCodes.ZipCode;

import java.util.Scanner;

public class WeatherClient implements WeatherClientInterface {


    @Override
    public WeatherObervation getWeather(ZipCode code) {
        String cloudcover = "n/a";
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
            String line = s.nextLine();
            if (line.contains("clouds") && !line.contains("cloudsCode")) {
                cloudcover = line.substring(13, line.length() - 2);
            }
            if (line.contains("temperature")) {
                double temperatureInC = Double.parseDouble(line.substring(18, line.length()-2));
                temperature = (temperatureInC * (9.0/5.0)) + 32;
            }
            if (line.contains("humidity")) {

                humidity = Double.parseDouble(line.substring(14,line.length()-1));
            }
            if (line.contains("windSpeed")) {
                windspeed = Double.parseDouble(line.substring(16,line.length()-2));
            }

        }
        return new WeatherObervation(temperature, windspeed, humidity, cloudcover);
    }
}

