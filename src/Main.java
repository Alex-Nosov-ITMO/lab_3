import Heroes.CristoferRobin;
import Heroes.FloatingBear;
import Heroes.Puh;
import Locations.HouseCristofers;
import Locations.LowlandForest;
import Locations.TheHighestLocationInForest;
import util.Dispute;
import util.Weather;

public class Main {
    public static void main(String[] agrs){

        /*Некоторое время Пух и "Плавучий Медведь" не могли решить вопроса о том,
         кто из них должен быть сверху, но в конце концов они договорились.*/
        Puh Puh = new Puh("Пух", true);
        FloatingBear Bear = new FloatingBear("Плавающий медведь", true);



        LowlandForest LowlandForest = new LowlandForest("Низина леса", Weather.RAINY);

        Puh.setLocation(LowlandForest);
        Bear.setLocation(LowlandForest);

        Puh.say("Я хочу плыть сверху");
        Bear.say("Нет, я буду сверху");


        Dispute dispute = new Dispute("Спор за место под солнцем");
        System.out.println(dispute.getName());
        String windispute = dispute.WhoWin(Puh, Bear);
        if (windispute == "Пух"){
            System.out.println(Puh.getName() + Puh.dangleFeet() + Bear.getName());
        }
        else System.out.println(Bear.getName() + Bear.ruthlesslyCrush() + Puh.getName());




        /*Кристофер Робин жил в самом высоком месте Леса.
        Дождь лил, лил и лил, но вода не могла добраться до его дома.
         */
        CristoferRobin cristoferRobin = new CristoferRobin("Кристофер Робин", false);
        HouseCristofers house = new HouseCristofers("Дом Кристофера");
        cristoferRobin.setLocation(house);
        TheHighestLocationInForest TheHighestLocationInForest = new TheHighestLocationInForest("Самое высокое место в лесу", Weather.RAINY);
        System.out.println(cristoferRobin.getName() + " " + cristoferRobin.live() + house.getName()+ " на " + TheHighestLocationInForest.getName());
        TheHighestLocationInForest.notWater();



        /*И, пожалуй, было довольно весело смотреть вниз и любоваться всей этой водой, но дождь был такой сильный,
         что Кристофер Робин почти все время сидел дома и думал о разных вещах.
         */

        System.out.println("Было довольно весело " + cristoferRobin.lookDawn() + " и "+ cristoferRobin.admireTheWater() +
                ", но " + Weather.RAINY.getWeatherDescription() + " настолько сильно, что " + cristoferRobin.getName() + " " + cristoferRobin.stayHome() +
                " и " + cristoferRobin.thingOfDifferentThings());





        System.out.println("Описание всех объектов:");
        System.out.println("Puh:" + Puh);
        System.out.println("FloatingBear:" + Bear);
        System.out.println("CristoferRobin:" + cristoferRobin);
        System.out.println("HouseCristofers:" + house);
        System.out.println("LowlandForest:" + LowlandForest);
        System.out.println("TheHighestLocationInForest:" + TheHighestLocationInForest);
        System.out.println("Dispute:" + dispute);
    }


}
