package util;
import Heroes.Hero;

import java.util.Objects;

import static java.lang.Math.*;
public class Dispute {
    private String name;


    public Dispute(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String WhoWin(Hero a, Hero b){

        final double CHANCE_TO_WIN = 0.5;

        if (!a.isDisputeMember() || !b.isDisputeMember()){
            System.out.println(a.getName() + " или " + b.getName() + " не может учавствовать в споре.");
        }

        else if (random() > 1 - CHANCE_TO_WIN) return a.getName();
        return b.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
            + "name=" + this.name + "]";
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;

        Dispute other = (Dispute) oth;
        return name.equals(other.name);
    }
}
