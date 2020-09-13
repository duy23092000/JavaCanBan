import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm:");
        year = input.nextInt();
        if (year % 4 == 0){
            System.out.println("Đây là năm nhuận!");
        }
        else{
            System.out.println("Đây là năm không nhuận!");
        }


    }
}