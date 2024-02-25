import java.time.*;
import java.time.temporal.ChronoUnit;

public class WorkWithTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime localNow = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

//        System.out.println(now);
//        System.out.println(localNow);
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(instant);

        LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);
        System.out.println("someDate " + someDate);

        ;
        System.out.println("someDate " + someDate.minus(3, ChronoUnit.DAYS));

    }
}
