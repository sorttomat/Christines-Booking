
class Room {
    private String _name;
    private float _size;
    private int _numberOfSeats;
    private float _pricePerHour;

    public Room(String name, float size, int numberOfSeats, float pricePerHour) {
        _name = name;
        _size = size;
        _numberOfSeats = numberOfSeats;
        _pricePerHour = pricePerHour;

    }

    public float getPrice(DateTime from, Duration duration) {
        float price = duration.getTotalHours() * _pricePerHour;
        return price;
    }

    public String toString() {
        return String.format("%s er av størrelse: %.2f, and seats: %d. Price per hour: %f", _name, _size, _numberOfSeats, _pricePerHour) ;
    } 

}