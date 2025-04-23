package Week3;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesAgain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate christmas25 = LocalDate.of(2025, 12, 25);
        System.out.println(christmas25);

        System.out.println(christmas25.getDayOfMonth());
        System.out.println(christmas25.getMonth());
        System.out.println(christmas25.getYear());

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);

        LocalTime fifteenThirty = LocalTime.of(15,30);

        System.out.println(fifteenThirty.getHour());
        System.out.println(fifteenThirty.getMinute());

        LocalDate thisDate = LocalDate.now();
        LocalTime thisTime = LocalTime.now();
        LocalDateTime timeDate = LocalDateTime.of(thisDate,thisTime);
        System.out.println(timeDate);
        LocalDate nextWeek = thisDate.plusWeeks(1);
        System.out.println(nextWeek);
        LocalDate minus3Days = nextWeek.minusDays(3);
        //LocalTime






    }
}
