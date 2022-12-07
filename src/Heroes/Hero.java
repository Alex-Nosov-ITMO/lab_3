package Heroes;


import java.util.Objects;

import Locations.Locatable;
import Locations.Location;


public abstract class Hero implements Locatable {
    public Hero(String name){
        setName(name);
    }
    private String name;


    Location location;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }



    @Override
    public Location locate() {
        return this.location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name==" + this.name + ", location=" + this.location + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;
        Hero other = (Hero) oth;
        return name.equals(other.name) && location.equals(other.location);
    }


    public void say(String text){
        System.out.println(this.name + " сказал:" + text);
    }

}
