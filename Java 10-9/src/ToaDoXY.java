import java.util.Scanner;

public class ToaDoXY {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tọa độ x:");
        x = input.nextInt();
        System.out.println("Nhập tọa độ y:");
        y = input.nextInt();
        if ((0 <= Math.abs(x) && Math.abs(x) < 2.5) && (0 <= Math.abs(y) && Math.abs(y) < 5)){
            System.out.println("Tọa độ (" + x + "," + y + ") thuộc hình chữ nhật");
        }
        else{
            System.out.println("Tọa độ (" + x + "," + y + ") nằm ngoài hình chữ nhật");
        }
    }
}
