package chapter2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(100.3f, 50.4f, 20f);
        weatherData.setMeasurements(100.7f, 80.4f, 22f);
        weatherData.setMeasurements(96.3f, 70.4f, 22f);
    }
}
