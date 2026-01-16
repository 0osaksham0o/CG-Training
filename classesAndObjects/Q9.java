package classesAndObjects;
class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
    }

    public void bookTicket(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}



public class Q9 {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 300);
        ticket.bookTicket(15);
        ticket.displayDetails();
    }
}
