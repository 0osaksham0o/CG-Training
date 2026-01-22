package Inheritance;

class Vehicle1 {
    int maxSpeed;
    String fuelType;

    Vehicle1(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle1 {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle1 {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
}

class Motorcycle extends Vehicle1 {
    boolean hasKickStart;

    Motorcycle(int maxSpeed, String fuelType, boolean hasKickStart) {
        super(maxSpeed, fuelType);
        this.hasKickStart = hasKickStart;
    }
}

public class q3 {
    public static void main(String[] args) {

        Vehicle1 v1 = new Car(180, "Petrol", 5);
        Vehicle1 v2 = new Truck(120, "Diesel", 12000);
        Vehicle1 v3 = new Motorcycle(140, "Petrol", true);

        v1.displayInfo();
        System.out.println();

        v2.displayInfo();
        System.out.println();

        v3.displayInfo();
    }

}
