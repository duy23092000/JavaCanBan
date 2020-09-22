package test15a;

public class DisplayRectangle {
    public static void main(String[] args) {
        var r1 = new Rectangle();
        var r2 = new Rectangle();
        r1.setEdge(40, 4);
        r2.setEdge(35.9,3.5);
        System.out.println("Diện tích hình chữ nhật thứ nhất là " +r1.getArea());
        System.out.println("Diện tích hình chữ nhật thứ hai là " + r2.getArea());
        System.out.println("Chu vi hình chữ nhật thứ nhất là " + r1.getPerimeter());
        System.out.println("Chu vi hình chữ nhật thứ hai là " + r2.getPerimeter());
    }
}
