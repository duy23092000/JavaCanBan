package test15b;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;
    private int x;
    private int y;


    public void setEdge(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public void setCo() {
        Scanner inputCo = new Scanner(System.in);
        x = inputCo.nextInt();
        y = inputCo.nextInt();

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
