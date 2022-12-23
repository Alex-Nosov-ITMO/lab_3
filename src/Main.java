import Heroes.CristoferRobin;
import Heroes.FloatingBear;
import Heroes.Hero;
import Heroes.Puh;
import Locations.HouseCristofers;
import Locations.LowlandForest;
import Locations.TheHighestLocationInForest;
import util.Dispute;
import util.Weather;

public class Main {
    public static void main(String[] agrs) {

        /*Некоторое время Пух и "Плавучий Медведь" не могли решить вопроса о том,
         кто из них должен быть сверху, но в конце концов они договорились.*/
        Puh puh = new Puh("Пух", true);
        FloatingBear bear = new FloatingBear("Плавающий медведь", true);


        LowlandForest lowlandForest = new LowlandForest("Низина леса", Weather.RAINY);

        puh.setLocation(lowlandForest);
        bear.setLocation(lowlandForest);

        puh.say("Я хочу плыть сверху");
        bear.say("Нет, я буду сверху");


        Dispute dispute = new Dispute("Спор за место под солнцем");
        Hero windispute = dispute.WhoWin(bear, puh);
        if (windispute.equals(puh)) puh.ride(bear);
        else if (windispute.equals(bear)) bear.ride(puh);





        /*Кристофер Робин жил в самом высоком месте Леса.
        Дождь лил, лил и лил, но вода не могла добраться до его дома.
         */
        CristoferRobin cristoferRobin = new CristoferRobin("Кристофер Робин", false);
        HouseCristofers house = new HouseCristofers("Дом Кристофера");
        cristoferRobin.setLocation(house);
        TheHighestLocationInForest theHighestLocationInForest = new TheHighestLocationInForest("Самое высокое место в лесу", Weather.RAINY);
        cristoferRobin.live();



        /*И, пожалуй, было довольно весело смотреть вниз и любоваться всей этой водой, но дождь был такой сильный,
         что Кристофер Робин почти все время сидел дома и думал о разных вещах.
         */
        cristoferRobin.sitHomeDuringTheRains();


        System.out.println("Описание всех объектов:");
        System.out.println("Puh:" + puh);
        System.out.println("FloatingBear:" + bear);
        System.out.println("CristoferRobin:" + cristoferRobin);
        System.out.println("HouseCristofers:" + house);
        System.out.println("LowlandForest:" + lowlandForest);
        System.out.println("TheHighestLocationInForest:" + theHighestLocationInForest);
        System.out.println("Dispute:" + dispute);


    }
}
