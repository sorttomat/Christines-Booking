class Duration {
    private int _totalMinutes;

    public Duration(int totalMinutes) {
        _totalMinutes = totalMinutes;
    }

    public String toString() {
        return String.format("%d years, %d months, %d days, %d hours, %d minutes.", getYear(), getMonth(), getDay(), getHour(), getMinute());
    }

    public float getTotalDays() {
        return getTotalHours() / 24;
    }

    public float getTotalHours() {
        return getTotalMinutes() / 60;
    }

    public float getTotalMinutes() {
        return _totalMinutes;
    }

    public int getMinute() {
        return _totalMinutes % 60;
    }

    public int getHour() {
        int totalHours = _totalMinutes / 60;
        return totalHours % 24;
    }

    public int getDay() {
        int totalHours = _totalMinutes / 60;
        int totalDays = totalHours / 24;
        return totalDays % 30;
    }

    public int getMonth() {
        int totalHours = _totalMinutes / 60;
        int totalDays = totalHours / 24;
        int totalMonths = totalDays / 30;
        return totalMonths % 12;
    }

    public int getYear(){
        int totalHours = _totalMinutes / 60;
        int totalDays = totalHours / 24;
        int totalMonths = totalDays / 30;
        int totalYears = totalMonths / 12;
        return totalYears;
    }
}