import java.time.*;

public class TimeProg1 {
    public static void main(String[] args) {
//      LocalDate d= LocalDate.now();
//        LocalDate d= LocalDate.of(1989, Month.FEBRUARY,21);
//        System.out.println(d);
//        LocalTime t=LocalTime.now();
//        System.out.println(t);
//        ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
//        ZonedDateTime indiaTime = ZonedDateTime.now(indiaZone);
//        System.out.println("Current Date and Time in India: " + indiaTime);
        LocalTime p=LocalTime.now(ZoneId.of("Antarctica/McMurdo"));
        System.out.println(p);
        for(String i:ZoneId.getAvailableZoneIds())
        {
            System.out.println(i);
        }
    }
}

