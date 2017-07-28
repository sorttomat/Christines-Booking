class Booking {
    private Room _room;
    private Customer _customer;
    private DateTime _start;
    private Duration _duration;

    public Booking(Room room, Customer customer, DateTime start, Duration duration) {
        _room = room;
        _customer = customer;
        _start = start;
        _duration = duration;
    }

    public String toString() {
        return String.format("%s har booket rommet %s fra %s så langt fram i tid: %s. Dette koster %.2f kr.", _customer.getName(), _room.getName(), _start.toString(), _duration.toString(), _room.calculatePrice(_start, _duration));

    }

}