package HW8;

import ZipCodes.ZipCode;

public interface WeatherClientInterface {
    WeatherObervation getWeather(ZipCode code);
}
