package Inheritance;


class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class Level1 {
    public static void main(String[] args) {


        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);

        // Calling overridden methods
        a1.makeSound(); // Dog barks
        a2.makeSound(); // Cat meows
        a3.makeSound(); // Bird chirps

        // Accessing inherited fields
        System.out.println(a1.name + " is " + a1.age + " years old");
        System.out.println(a2.name + " is " + a2.age + " years old");
        System.out.println(a3.name + " is " + a3.age + " years old");
    }


}
