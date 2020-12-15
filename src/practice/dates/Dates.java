package practice.dates;

// https://www.baeldung.com/java-8-date-time-intro

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 12, 27);
        localDate.getDayOfWeek().name();
    }
}
