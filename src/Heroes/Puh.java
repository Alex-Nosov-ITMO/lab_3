package Heroes;


import util.Ride;

public class Puh extends Hero implements Ride {
    public Puh(String name, boolean disputemember){
        super(name, disputemember);
    }

    @Override
    public void ride(Hero a) {
        System.out.println(this.getName() + this.dangleFeet() + a.getName());
    }

    public String dangleFeet (){
        return " ехал, отчаянно болтая ногами, на ";
    }




}
