class Duration {
    private int minutes;
    private int hours;
    private int days;
    private int months;
    private int years;

    public Duration(int years, int months, int days, int hours, int minutes) {
        this.minutes = minutes;
        this.hours = hours;
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public String toString() {
        return String.format("%d years, %d months, %d days, %d hours, %d minutes.", years, months, days, hours,
                minutes);
    }

    public float getTotalDays() {
        return getTotalHours() / 24;
    }

    public float getTotalHours() {
        return getTotalMinutes() / 60;
    }

    public float getTotalMinutes() {
        float totalMinutes = 0;

        totalMinutes += this.minutes;
        totalMinutes += this.hours * 60;
        totalMinutes += this.days * 60 * 24;
        totalMinutes += this.months * 60 * 24 * 30; //TODO: Er måneder med i denne?
        totalMinutes += this.years * 60 * 24 * 30 * 12;

        return totalMinutes;
    }

}