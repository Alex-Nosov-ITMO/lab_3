package Heroes;

public class CristoferRobin extends Hero{
    public CristoferRobin(String name, boolean disputemember){
        super(name, disputemember);
    }
    public String live(){
        return "живет в ";
    }

    public String lookDawn(){
        return "смотреть вниз";
    }

    public String admireTheWater(){
        return "любоваться водой";
    }

    public String stayHome(){
        return "остаться дома ";
    }

    public String thingOfDifferentThings(){
        return "Думать о разных вещах";
    }
}
