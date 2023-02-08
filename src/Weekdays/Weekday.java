package Weekdays;

enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private Object weekday;
    private Object weekend;

    public boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;
    }
    public boolean isHoliday() {
        return !isWeekday();
    }

}

