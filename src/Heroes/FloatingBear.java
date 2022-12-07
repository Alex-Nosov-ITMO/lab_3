package Heroes;

import util.DisputeMembers;
import util.Weather;

public class FloatingBear extends Hero implements DisputeMembers {
    public FloatingBear(String name){
        super(name);
    }

    public String RuthlesslyCrush(){
        return "безжалостно давя, ехал на";
    }

    @Override
    public boolean DisputeMember() {
        return true;
    }
}
