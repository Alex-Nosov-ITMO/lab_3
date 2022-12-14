package Heroes;


import java.util.Objects;

import Locations.Locatable;
import Locations.Location;
import util.DisputeMembers;


public abstract class Hero implements Locatable, DisputeMembers {
    public Hero(String name, boolean disputemember){
        setName(name);
        setDisputeMember(disputemember);
    }


    private String name;
    private boolean disputemember;


    Location location;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void setDisputeMember(boolean disputemember) {
        this.disputemember = disputemember;
    }

    @Override
    public boolean isDisputeMember() {
        return this.disputemember;
    }

    @Override
    public String locate() {
        return this.location.getName();
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name==" + this.name + ", location=" + this.location + ", disputemember=" + this.disputemember + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, disputemember);
    }


    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;
        Hero other = (Hero) oth;
        return name.equals(other.name) && location.equals(other.location) && disputemember == other.disputemember;
    }


    public void say(String text){
        System.out.println(this.name + " сказал:" + text);
    }

}
