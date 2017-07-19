class DateTime {
    private int _minutesSinceYear0;

    public DateTime(int year, int month, int day, int hour, int minute) {
        _minutesSinceYear0 = minute;
        _minutesSinceYear0 += hour * 60;
        _minutesSinceYear0 += (day - 1) * 24 * 60;
        _minutesSinceYear0 += (month - 1) * 30 * 24 * 60;
        _minutesSinceYear0 += year * 12 * 30 * 24 * 60;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d", getYear(), getMonth(), getDay(), getHour(), getMinute());
    }

    private int getMinute() {
        return _minutesSinceYear0 % 60;
    }

    private int getHour() {
        int hoursSinceYear0 = _minutesSinceYear0 / 60;
        return hoursSinceYear0 % 24;
    }

    private int getDay() {
        int hoursSinceYear0 = _minutesSinceYear0 / 60;
        int daysSinceYear0 = hoursSinceYear0 / 24;
        return (daysSinceYear0 % 30) + 1;
    }

    private int getMonth() {
        int hoursSinceYear0 = _minutesSinceYear0 / 60;
        int daysSinceYear0 = hoursSinceYear0 / 24;
        int monthsSinceYear0 = daysSinceYear0 / 30;
        return (monthsSinceYear0 % 12) + 1;
    }

    private int getYear() {
        int hoursSinceYear0 = _minutesSinceYear0 / 60;
        int daysSinceYear0 = hoursSinceYear0 / 24;
        int monthsSinceYear0 = daysSinceYear0 / 30;
        int yearsSinceYear0 = monthsSinceYear0 / 12;
        return yearsSinceYear0;
    }

    public Duration subtract(DateTime other) {
        int minutesDifference = this._minutesSinceYear0 - other._minutesSinceYear0;
        return new Duration(minutesDifference);

    }

    public void addMinutes(int minutesToAdd) {
        _minutesSinceYear0 += minutesToAdd;
    }

}