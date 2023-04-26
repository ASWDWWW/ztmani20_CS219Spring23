package HW8;

public class WeatherObervation {
    protected double temperature;
    protected double windspeed;
    protected double humidity;
    protected String cloudcover;

    public WeatherObervation(double temperature, double windspeed, double humidity, String cloudcover) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public double getHumidity() {
        return humidity;
    }

    public String  getCloudcover() {
        return cloudcover;
    }
}
