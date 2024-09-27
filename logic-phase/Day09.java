import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Day09 {
    public static void main(String[] args) {

        // Epoch Date
        Long epoch = System.currentTimeMillis();
        System.out.println("Current UNIX Epoch: " + epoch);

        Date epochDate = new Date(0);
        System.out.println("Epoch Date = " + epochDate);

        Date currentDate = new Date(epoch);
        System.out.println("Current Epoch Date: " + currentDate);

        // Basic Date / Time
        Date date = new Date();
        System.out.println("Current Date = " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.SEPTEMBER, 27);
        System.out.println("Custom Date = " + calendar.getTime());

        // Format Date Time
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy hh:mm:ss a z",
                Locale.forLanguageTag("id-ID"));
        System.out.println("Formatted Date = " + dateFormat.format(epochDate));

        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date = " + localDate);

        // LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time = " + localTime);

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time = " + localDateTime);

        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time = " + zonedDateTime);

        ZonedDateTime customZone = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Custom Zone Date Time = " + customZone);

        // DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy",
                Locale.forLanguageTag("id-ID"));
        System.out.println("Formatted Date = " + dateTimeFormatter.format(customZone));

        // Date / Time Plus
        System.out.println("5 Days Later = " + dateTimeFormatter.format(localDate.plusDays(5)));
        System.out.println("5 Hours Later = " + localTime.plusHours(5));
        System.out.println("5 Hours ago = " + localTime.plusHours(-5));

        // Parsing String to LocalDate/Time
        String strStartDate = "2024-09-27";
        String strEndDate = "2024-09-30";
        LocalDate startDate = LocalDate.parse(strStartDate);
        LocalDate endDate = LocalDate.parse(strEndDate);
        // System.out.println("Start Date = " + startDate);
        System.out.println("Start Date = " + dateTimeFormatter.format(startDate));
        // System.out.println("End Date = " + endDate);
        System.out.println("End Date = " + dateTimeFormatter.format(endDate));

        // ChronoUnit
        Long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("The Difference are " + days + " days");
    }
}
