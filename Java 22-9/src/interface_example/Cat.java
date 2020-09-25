package interface_example;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Run as fast as possible");
    }

    @Override
    public void eat() {
        System.out.println("Cat likes mouse");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep anywhere he likes");
    }
}
