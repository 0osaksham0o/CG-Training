package Inheritance;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    @Override
    public void performDuties() {
        System.out.println("Cooking food");
    }
}

class Waiter extends Person implements Worker {
    @Override
    public void performDuties() {
        System.out.println("Serving customers");
    }
}

public class q4 {
    public static void main(String[] args) {

        Worker w1 = new Chef();
        Worker w2 = new Waiter();

        w1.performDuties();   // Cooking food
        w2.performDuties();   // Serving customers
    }


}
