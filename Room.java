import java.util.Date;

class Room {
    private String name;
    private float size;
    private int numberOfSeats;

    public Room(String name) {
        this.name = name;
    }

    public float getPrice(Date from, Date to) {
        return 0;
    }

    public void printInfo() {
        System.out.format("%s er av størrelse: %f, and seats: %d %n", name, size, numberOfSeats) ;
    }

}