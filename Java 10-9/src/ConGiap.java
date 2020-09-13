import java.util.Scanner;

public class ConGiap {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm:");
        choice = input.nextInt();
        switch (choice){
            case 0:
                System.out.println("Đây là năm Tí!");
                break;
            case 1:
                System.out.println("Đây là năm Sửu!");
                break;
            case 2:
                System.out.println("Đây là năm Dần!");
                break;
            case 3:
                System.out.println("Đây là năm Mão!");
                break;
            case 4:
                System.out.println("Đây là năm Thìn!");
                break;
            case 5:
                System.out.println("Đây là năm Tỵ!");
                break;
            case 6:
                System.out.println("Đây là năm Ngọ!");
                break;
            case 7:
                System.out.println("Đây là năm Mùi!");
                break;
            case 8:
                System.out.println("Đây là năm Thân!");
                break;
            case 9:
                System.out.println("Đây là năm Dậu!");
                break;
            case 10:
                System.out.println("Đây là năm Tuất!");
                break;
            case 11:
                System.out.println("Đây là năm Hợi!");
                break;
            default:
                System.out.println("Lựa chọn không nằm trong danh sách. Vui lòng thử lại!");

        }
    }
}