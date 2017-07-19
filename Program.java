
class Program {
    public static void main(String[] args) {
        System.out.println("Velkommen til Christine og Arjans fantastiske rombooking!");

        DateTime start = new DateTime(2016, 5, 15, 8, 30);
        DateTime end = new DateTime(2017, 7, 18, 9, 15);

        Duration d = end.subtract(start); //Value before edit: 46131.25

        System.out.println(d);

    }

}