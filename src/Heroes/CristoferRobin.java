package Heroes;

import util.Weather;

public class CristoferRobin extends Hero{
    public CristoferRobin(String name, boolean disputemember){
        super(name, disputemember);
    }
    public void live(){
        System.out.println(this.getName() + " живет в " + this.locate());
    }

    public String lookDawn(){
        return " смотреть вниз";
    }

    public String admireTheWater(){
        return " любоваться водой";
    }

    public String stayHome(){
        return " решил остаться дома ";
    }

    public String thingOfDifferentThings(){
        return " думать о разных вещах";
    }


    public void SitHomeDuringTheRains(){
        System.out.println(this.getName() + this.lookDawn() +" и" + this.admireTheWater() + " было весело, но "
                + Weather.RAINY + this.getName() + this.stayHome() + "и" + this.thingOfDifferentThings());
    }
}
