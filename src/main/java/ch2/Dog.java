package main.java.ch2;

public class Dog {
    int size;
    String breed;
    String name;
    public void bark() {
        System.out.println("Ruff, Ruff!!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.size = 40;
        dog.bark();
    }
}
