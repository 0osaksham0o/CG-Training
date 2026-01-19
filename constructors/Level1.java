package constructors;

class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Circle {
    private double radius;

    public Circle() {
        this(1.0); // constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}


class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }
}


class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available = true;

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }
}


class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateCost();
    }

    private void calculateCost() {
        totalCost = rentalDays * 1000;
    }

    public void displayBill() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}


public class Level1 {

    public static void main(String[] args) {


        Book book1 = new Book();
        System.out.println("Book created using default constructor");


        Book book2 = new Book("Java Basics", "James Gosling", 499.99);
        System.out.println("Book created using parameterized constructor");


        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        System.out.println("Circle objects created");


        Person p1 = new Person("Rahul", 22);


        Person p2 = new Person(p1);
        System.out.println("Person copied using copy constructor");


        HotelBooking hb1 = new HotelBooking();


        HotelBooking hb2 = new HotelBooking("Amit", "Deluxe", 3);


        HotelBooking hb3 = new HotelBooking(hb2);
        System.out.println("Hotel bookings created");


        LibraryBook lb = new LibraryBook();
        lb.borrowBook();
        lb.borrowBook(); // second attempt


        CarRental rental = new CarRental("Saksham", "Honda City", 4);
        rental.displayBill();
        System.out.println("Car rented successfully");
    }
}

