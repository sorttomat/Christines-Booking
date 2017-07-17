
class Program {
    public static void main(String[] args) {
        System.out.println("Velkommen til Christine og Arjans fantastiske rombooking!");

        DateTime start = new DateTime(2017, 7, 18, 8, 30);
        DateTime end = new DateTime(2017, 7, 18, 8, 45);

        Room room1 = new Room("Pluto", 40.0f, 16);

        room1.printInfo();
        float a = room1.getPrice(start, end);
        System.out.println(a);

    }

}