package staticKeywords;

//q1 BankAccount system
class BankAccount {

    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

// q2 Library Management System
class Book {

    static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBook(Object obj) {
        if (obj instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

//q3 Employee Management System

class Employee {

    static String companyName = "Infosys";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployee(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

//q4 shopping cart system

class Product {

    static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void processProduct(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

//q5 University student management system
class Student {

    static String universityName = "Delhi University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

//q6 Vehicle Registration system
class Vehicle {

    static double registrationFee = 5000;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Reg Number: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }
}


public class Level1 {

    public static void main(String[] args) {

        // ===== Q1: BankAccount =====
        BankAccount acc1 = new BankAccount("Rahul", 101);
        BankAccount acc2 = new BankAccount("Amit", 102);

        acc1.displayDetails(acc1);
        acc2.displayDetails(acc2);
        BankAccount.getTotalAccounts();

        System.out.println();

        // ===== Q2: Book =====
        Book book1 = new Book("Java Basics", "James Gosling", "ISBN101");
        Book.displayLibraryName();
        book1.displayBook(book1);

        System.out.println();

        // ===== Q3: Employee =====
        Employee emp1 = new Employee("Saksham", 1, "Developer");
        Employee emp2 = new Employee("Neha", 2, "Tester");

        emp1.displayEmployee(emp1);
        emp2.displayEmployee(emp2);
        Employee.displayTotalEmployees();

        System.out.println();

        // ===== Q4: Product =====
        Product prod1 = new Product("Laptop", 70000, 1, 501);
        Product.updateDiscount(15);
        prod1.processProduct(prod1);

        System.out.println();

        // ===== Q5: Student =====
        Student s1 = new Student("Ravi", 201, 'A');
        Student s2 = new Student("Anita", 202, 'B');

        s1.displayStudent(s1);
        s2.displayStudent(s2);
        Student.displayTotalStudents();

        System.out.println();

        // ===== Q6: Vehicle =====
        Vehicle v1 = new Vehicle("Arjun", "Car", "DL01AB1234");
        Vehicle.updateRegistrationFee(5500);
        v1.displayVehicle(v1);
    }
}

