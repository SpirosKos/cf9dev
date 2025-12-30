package gr.aueb.cf.cf9.ch17.enums;

public class MainWeek {

    public static void main(String[] args) {
        for (WeekDay weekday : WeekDay.values()) {
            System.out.println(weekday.getDay());
        }
    }
}
