
class Program {
    public static void main(String[] args) {
        System.out.println("Velkommen til Christine og Arjans fantastiske rombooking!");

        DateTime start = new DateTime(2017, 7, 18, 8, 30);
        DateTime end = new DateTime(2017, 7, 18, 9, 15);

        Duration d = end.subtract(start);

        System.out.println(d);

    }

}