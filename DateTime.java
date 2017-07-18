class DateTime {
    private int _year;
    private int _month;
    private int _day;
    private int _hour;
    private int _minute;

    public DateTime(int year, int month, int day, int hour, int minute) {
        _year = year;
        _month = month;
        _day = day;
        _hour = hour;
        _minute = minute;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d", _year, _month, _day, _hour, _minute);
    }

    public Duration subtract(DateTime x) {
        int minutes;
        int hours = 0;
        int days = 0;
        int months = 0;
        int years = 0;

        minutes = _minute - x._minute;
        if (minutes < 0){
            minutes += 60;
            hours -= 1;
        }

        hours += _hour - x._hour;
        if (hours < 0){
            hours += 24;
            days -= 1;
        }
                
        days += _day - x._day;
        if (days < 0){
            days += 30;
            months -= 1;
        }
                
        months += _month - x._month;
        if (months < 0){
            months += 12;
            years -= 1;
        }
                        
        years += _year - x._year;



        return new Duration(years, months, days, hours, minutes);
        //TODO: ta hensyn til timer, dager, måneder, år.
    }
}