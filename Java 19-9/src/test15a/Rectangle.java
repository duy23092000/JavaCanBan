package test15a;

public class Rectangle {
    private double width;
    private double height;

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getArea() {
        return width * height;
    }

    public void setEdge(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
