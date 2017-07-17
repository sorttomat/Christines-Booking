
class Room {
    private String name;
    private float size;
    private int numberOfSeats;

    public Room(String name, float size, int numberOfSeats) {
        this.name = name;
        this.size = size;
        this.numberOfSeats = numberOfSeats;
    }

    public float getPrice(DateTime from, DateTime to) {
        //duration = to.subtract(from) 
        //price = duration * pricePerHour
        //return price
        return 0;
    }

    public void printInfo() {
        System.out.format("%s er av størrelse: %.2f, and seats: %d %n", name, size, numberOfSeats) ;
    } 

}