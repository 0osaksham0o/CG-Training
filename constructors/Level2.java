package constructors;

// q online course management
class Course {
    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + ", " + duration + ", " + fee + ", " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}

// vehicle registration

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println(ownerName + " owns " + vehicleType);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}


// q university management system

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    public void display() {
        System.out.println(rollNumber + " " + name);
    }
}




// q bank account management

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }
}




// q employee records

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    public void showDetails() {
        System.out.println(employeeID + " " + department);
    }
}




public class Level2 {

    public static void main(String[] args) {

        //  Course
        Course c1 = new Course("Java Full Stack", 6, 45000);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();


        // Vehicle
        Vehicle v1 = new Vehicle("Rahul", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);


        //  Student
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Amit";
        pg.setCgpa(8.5);

        pg.display();
        System.out.println("CGPA: " + pg.getCgpa());


        //  Bank Account
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "ACC12345";
        sa.accountHolder = "Neha";
        sa.setBalance(25000);

        sa.display();
        System.out.println("Balance: " + sa.getBalance());


        // Employee
        Manager m = new Manager();
        m.employeeID = 501;
        m.department = "IT";
        m.setSalary(90000);

        m.showDetails();
    }
}

