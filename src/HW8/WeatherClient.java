package HW8;

import Utility.Util;
import ZipCodes.ZipCode;

import java.util.Scanner;

public class WeatherClient extends WeatherObervation implements WeatherClientInterface{


    public WeatherClient(double temperature, double windspeed, double humidity, String cloudcover) {
        super(temperature, windspeed, humidity, cloudcover);
    }

    @Override
    public WeatherObervation getWeather(ZipCode code) {

        String lat = String.valueOf(code.getCoord().getLat());
        String lng = String.valueOf(code.getCoord().getLng());
        String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=" + lat + "&lng=-" + lng + "&username=edharcourt";
        Scanner s = Util.openSite(path);
        if (s == null) {
            return null;
        }
        else {
            System.out.println(s);
            if(s.hasNext("tempature")){
                this.temperature = s.nextDouble();
            }
            if(s.hasNext("windSpeed")){
                this.windspeed = s.nextDouble();
            }
            if(s.hasNext("humidity")){
                this.humidity = s.nextDouble();
            }
            if(s.hasNext("clouds")){
                cloudcover = s.toString();
                this.cloudcover = cloudcover.substring(10,cloudcover.length()-2);
            }
            else {
                this.cloudcover = "n/a";
            }
            return new WeatherObervation(temperature, windspeed, humidity, cloudcover);
        }
    }
}

