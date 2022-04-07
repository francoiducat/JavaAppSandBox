package net.ducatillon.javasandbox.timestamps;

import static java.time.ZoneOffset.UTC;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Timestamps {

  private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

  public static void main(String[] args) {

    long test_timestamp = 1615475820;
    LocalDateTime triggerTime =
        LocalDateTime.ofInstant(Instant.ofEpochSecond(test_timestamp), UTC);

    System.out.println("1. Long timestamp to Localdatetime: " + triggerTime);

    long test_timestamp_long = 1499070300000L;
    LocalDateTime localDateTime =
        LocalDateTime.ofInstant(Instant.ofEpochMilli(test_timestamp_long),
            UTC);

    System.out.println("2. Long timestamp to Localdatetime: " + localDateTime);

    Timestamp sqlTimestamp = new Timestamp(System.currentTimeMillis());
    System.out.println("sqlTimestamp: " + sqlTimestamp);

    //return number of milliseconds since January 1, 1970, 00:00:00 GMT
    System.out.println("sqlTimestamp.getTime(): " + sqlTimestamp.getTime());

    // Convert sqlTimestamp to instant
    Instant instant = sqlTimestamp.toInstant();
    System.out.println("instant: " + instant);

    //return number of milliseconds since the epoch of 1970-01-01T00:00:00Z
    System.out.println("instant.toEpochMilli(): " + instant.toEpochMilli());

    // Convert instant to sqlTimestamp
    Timestamp tsFromInstant = Timestamp.from(instant);
    System.out.println("tsFromInstant.getTime() => Long: " + tsFromInstant.getTime());

    System.out.println("new Date().getTime(): " + new Date().getTime());

    //method - via Date
    System.out.println("Timestamp from java.util.Date => new Timestamp(date.getTime()) => Long: " + new Timestamp(new Date().getTime()));

    //return number of milliseconds since January 1, 1970, 00:00:00 GM
    System.out.println("sqlTimestamp.getTime() => Long: " + sqlTimestamp.getTime());

    //format sqlTimestamp
    System.out.println("format sqlTimestamp: " + sdf.format(sqlTimestamp));

  }

  private LocalDateTime localDateTimeFromLong(Long lg) {
    return LocalDateTime.ofInstant(Instant.ofEpochSecond(lg), UTC);
  }

  private Long longFromLocalDateTime(LocalDateTime ldt) {
    return ldt.toInstant(UTC).getEpochSecond();
  }

}
