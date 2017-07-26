class DateTime {
    private int _minutesSinceYear0;


    private DateTime(int minutesSinceYear0) {
        _minutesSinceYear0 = minutesSinceYear0;
    }
    public DateTime(int year, int month, int day, int hour, int minute) {
        _minutesSinceYear0 = minute;
        _minutesSinceYear0 += hour * Duration.MINUTES_PER_HOUR;
        _minutesSinceYear0 += (day - 1) * Duration.MINUTES_PER_DAY;
        _minutesSinceYear0 += (month - 1) * 30 * Duration.MINUTES_PER_DAY;
        _minutesSinceYear0 += year * 12 * 30 * Duration.MINUTES_PER_DAY;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d", getYear(), getMonth(), getDay(), getHour(), getMinute());
    }

    private int getMinute() {
        return _minutesSinceYear0 % Duration.MINUTES_PER_HOUR;
    }

    private int getHour() {
        int hoursSinceYear0 = _minutesSinceYear0 / Duration.MINUTES_PER_HOUR;
        return hoursSinceYear0 % Duration.HOURS_PER_DAY;
    }

    private int getDay() {
        int hoursSinceYear0 = _minutesSinceYear0 / Duration.MINUTES_PER_HOUR;
        int daysSinceYear0 = hoursSinceYear0 / Duration.HOURS_PER_DAY;
        return (daysSinceYear0 % 30) + 1;
    }

    private int getMonth() {
        int hoursSinceYear0 = _minutesSinceYear0 / Duration.MINUTES_PER_HOUR;
        int daysSinceYear0 = hoursSinceYear0 / Duration.HOURS_PER_DAY;
        int monthsSinceYear0 = daysSinceYear0 / 30;
        return (monthsSinceYear0 % 12) + 1;
    }

    private int getYear() {
        int hoursSinceYear0 = _minutesSinceYear0 / Duration.MINUTES_PER_HOUR;
        int daysSinceYear0 = hoursSinceYear0 / Duration.HOURS_PER_DAY;
        int monthsSinceYear0 = daysSinceYear0 / 30;
        int yearsSinceYear0 = monthsSinceYear0 / 12;
        return yearsSinceYear0;
    }

    public Duration subtract(DateTime other) {
        int minutesDifference = this._minutesSinceYear0 - other._minutesSinceYear0;
        return Duration.fromMinutes(minutesDifference);

    }

    public DateTime addMinutes(int minutesToAdd) {
        return new DateTime(_minutesSinceYear0 + minutesToAdd);
    }

    public DateTime addHours(int hoursToAdd) {
        return addMinutes(hoursToAdd * Duration.MINUTES_PER_HOUR);
    }

    public DateTime addDays(int daysToAdd) {
        return addHours(daysToAdd * Duration.HOURS_PER_DAY);
    }

    public DateTime add(Duration durationToAdd){
        return addMinutes((int)durationToAdd.getTotalMinutes());
    }
}