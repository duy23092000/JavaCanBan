package interface_example;

import java.io.Serializable;

public class Dog implements Animal, Serializable, Comparable<Dog> {
    @Override
    public void move() {
        System.out.println("Dog moves");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
