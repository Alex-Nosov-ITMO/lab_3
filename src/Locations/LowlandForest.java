package Locations;

import util.Weather;

public class LowlandForest extends OpenLocations{
    public LowlandForest(String name, Weather weather){
        super(name, weather);
        System.out.println(weather.getWeatherDescription());
    }
}
