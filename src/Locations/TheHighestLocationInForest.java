package Locations;

import util.Weather;

public class TheHighestLocationInForest extends OpenLocations {
    public TheHighestLocationInForest(String name, Weather weather) {
        super(name, weather);
        System.out.println(weather.getWeatherDescription());
        System.out.println("Однако вода от дождя не доходит до " + this.getName());
    }

}
