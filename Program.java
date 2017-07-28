class Program {
    public static void main(String[] args) {
        System.out.println("Velkommen til Christine og Arjans fantastiske rombooking!");

        Room[] rooms = new Room[5];
        rooms[0] = new Room("Mercur", 30, 20, 250);
        rooms[1] = new Room("Venus", 20, 10, 200);
        rooms[2] = new Room("Tellus", 25, 25, 300);
        rooms[3] = new Room("Mars", 10, 5, 100);
        rooms[4] = new Room("Jupiter", 75, 200, 550);

        for (Room room : rooms) {
            System.out.println(room);
        }
        System.out.println();

        Customer[] customers = new Customer[5];
        customers[0] = new Customer("Arjan", "Gesellsvingen 47");
        customers[1] = new Customer("Marit", "Hytta på fjellet");
        customers[2] = new Customer("Casper Leonard", "Tolia 27");
        customers[3] = new Customer("Petter", "Liksomveien 5");
        customers[4] = new Customer("Kjell", "Seljeveien 27");

        for (Customer cust : customers) {
            System.out.println(cust);
        }
        System.out.println();


        Booking[] bookings = {
                new Booking(rooms[0], customers[0], new DateTime(2012, 9, 12, 17, 30), new Duration(0, 1, 30)),
                new Booking(rooms[1], customers[0], new DateTime(2016, 11, 3, 21, 1), new Duration(2, 3, 5)),
                new Booking(rooms[2], customers[3], new DateTime(1991, 9, 2, 5, 45), new Duration(3, 7, 1)),
                new Booking(rooms[2], customers[4], new DateTime(2009, 1, 5, 20, 10), new Duration(0, 11, 10)) };

        for (Booking book : bookings) {
            System.out.println(book);
        }

    }

}