package Heroes;

import util.DisputeMembers;

public class Puh extends Hero implements DisputeMembers {
    public Puh(String name){
        super(name);
    }

    public String DangleFeet (){
        return "ехал, отчаянно болтая ногами, на";
    }

    @Override
    public boolean DisputeMember(){
        return true;
    }


}
