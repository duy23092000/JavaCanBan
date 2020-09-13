import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a:");
        int a = input.nextInt();
        System.out.println("Nhập độ dài cạnh b:");
        int b = input.nextInt();
        System.out.println("Nhập độ dài cạnh c:");
        int c = input.nextInt();
        if ( ((a + b) > c) && ((a + c) > b) && (b + c) > b){
            int P = a + b + c;
            System.out.println("Chu vi hình tam giác là " + P);
        }
        else{
            System.out.println("3 cạnh a, b, c không phải của một hình tam giác!");
        }


    }
}