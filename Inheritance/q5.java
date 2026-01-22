package Inheritance;
interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Charging vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}

public class q5 {
    public static void main(String[] args) {

        Vehicle v1 = new ElectricVehicle();
        Vehicle v2 = new PetrolVehicle();

        ((ElectricVehicle) v1).charge();
        ((PetrolVehicle) v2).refuel();
    }


}
