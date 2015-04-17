package eu.maurosabatino.openweather;


import eu.maurosabatino.openweather.exception.IconNotFoundException;
import weather.Weather;

public class WeatherIconMapper {

    public static int getIconResourceIdForWeather(Weather weather) throws IconNotFoundException {
        if(weather.getWeatherIconId().equals("sun")) {
            return R.drawable.ic_action_sunny;
        }
        throw new IconNotFoundException();
    }
}
