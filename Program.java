
class Program {
    public static void main(String[] args) {
        System.out.println("Velkommen til Christine og Arjans fantastiske rombooking!");

        DateTime start = new DateTime(2016, 5, 15, 8, 30);
        DateTime end = start.addHours(2);

        Duration d = end.subtract(start); //Value before edit: 46131.25
        System.out.println(d);

        Customer a = new Customer("Christine", "Gesellsvingen 47");
        System.out.println(a);

        Room abc = new Room("Petter", 20, 10, 200);
        System.out.println(abc);
        float priceAbc = abc.getPrice(start, Duration.fromDays(2));
        System.out.println(priceAbc);





    }

}