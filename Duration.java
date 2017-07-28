class Duration {
    public static final int MINUTES_PER_HOUR = 60;
    public static final int HOURS_PER_DAY = 24;
    public static final int MINUTES_PER_DAY = MINUTES_PER_HOUR * HOURS_PER_DAY;

    private int _totalMinutes;

    private Duration(int totalMinutes) {
        _totalMinutes = totalMinutes;
    }

    public Duration(int days, int hours, int minutes) {
        this(days * MINUTES_PER_DAY + hours * MINUTES_PER_HOUR + minutes);
    }

    
    public static Duration fromMinutes(int minutes){
        return new Duration(minutes);
    }

    public static Duration fromHours(int hours){
        return fromMinutes(hours * MINUTES_PER_HOUR);
    }

    public static Duration fromDays(int days){
        return fromHours(days * HOURS_PER_DAY);
    }

    public String toString() {
        return String.format("%d d, %d h, %d m", getDay(), getHour(), getMinute());
    }

    public float getTotalDays() {
        return getTotalHours() / HOURS_PER_DAY;
    }

    public float getTotalHours() {
        return getTotalMinutes() / MINUTES_PER_HOUR;
    }

    public float getTotalMinutes() {
        return _totalMinutes;
    }

    public int getMinute() {
        return _totalMinutes % MINUTES_PER_HOUR;
    }

    public int getHour() {
        int totalHours = _totalMinutes / MINUTES_PER_HOUR;
        return totalHours % HOURS_PER_DAY;
    }

    public int getDay() {
        int totalHours = _totalMinutes / MINUTES_PER_HOUR;
        int totalDays = totalHours / HOURS_PER_DAY;
        return totalDays;
    }
}