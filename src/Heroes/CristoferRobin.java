package Heroes;

import Locations.TheHighestLocationInForest;

public class CristoferRobin extends Hero{
    public CristoferRobin(String name){
        super(name);
    }
    public String Live(){
        return "живет в ";
    }

    public String LookDawn(){
        return "сотреть вниз";
    }

    public String AdmireTheWater(){
        return "любоваться водой";
    }

    public String StayHome(){
        return "остаться в ";
    }

    public String ThingOfDifferentThings(){
        return "Думать о разных вещах";
    }
}
