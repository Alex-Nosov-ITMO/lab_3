package Locations;

import util.Weather;

import java.util.Objects;

public abstract class OpenLocations extends Location{
    private Weather weather;

    public OpenLocations(String name, Weather weather){
        super(name);
        this.weather = weather;
    }

    public OpenLocations(String name){
        super(name);
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        System.out.println(weather.getWeatherDescription());
    }

    @Override
    public String toString() {
        return super.toString() + "["
                + "weather=" + this.weather + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weather);
    }

    @Override
    public boolean equals(Object oth) {
        if (!super.equals(oth)) return false;
        OpenLocations other = (OpenLocations) oth;
        return Objects.equals(weather, other.weather);
    }
}
