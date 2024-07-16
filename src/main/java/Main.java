import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //Output current date and time
        ZonedDateTime today = ZonedDateTime.now();
        System.out.println(today);
        // Add two weeks to current date
        ZonedDateTime inTwoWeeks = today.plusWeeks(2);
        System.out.println(inTwoWeeks);

        // Compare current date with future date
        if (today.compareTo(inTwoWeeks) > 0) {
            System.out.println(today.format(DateTimeFormatter.ISO_LOCAL_DATE)  + " comes after " + inTwoWeeks.format(DateTimeFormatter.ISO_LOCAL_DATE) );
        } else {
            System.out.println(today.format(DateTimeFormatter.ISO_LOCAL_DATE) + " comes before " + inTwoWeeks.format(DateTimeFormatter.ISO_LOCAL_DATE) );
        }
        System.out.println(today.isAfter(inTwoWeeks));
        System.out.println(today.isBefore(inTwoWeeks));

        // Calculate difference in days between two arbitrary dates
        ZonedDateTime date1 = ZonedDateTime.of(2009,4,5,22,12,12,0, ZoneId.systemDefault());
        ZonedDateTime date2 = ZonedDateTime.of(2014,12,1,14,5,45,0, ZoneId.systemDefault());
        System.out.println(date1);
        System.out.println(date2);
        long differenceInDays = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(differenceInDays);

    }
}