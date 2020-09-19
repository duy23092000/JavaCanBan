package congiap;

import java.util.Scanner;

public class Input {
    private byte numberInput;

    public void getNumberInput() {
        Scanner input = new Scanner(System.in);
        numberInput = input.nextByte();
    }

    public void displayYear() {
        switch (numberInput) {
            case 0 -> System.out.println("Đây là năm Tí!");
            case 1 -> System.out.println("Đây là năm Sửu!");
            case 2 -> System.out.println("Đây là năm Dần!");
            case 3 -> System.out.println("Đây là năm Mão!");
            case 4 -> System.out.println("Đây là năm Thìn!");
            case 5 -> System.out.println("Đây là năm Tỵ!");
            case 6 -> System.out.println("Đây là năm Ngọ!");
            case 7 -> System.out.println("Đây là năm Mùi!");
            case 8 -> System.out.println("Đây là năm Thân!");
            case 9 -> System.out.println("Đây là năm Dậu!");
            case 10 -> System.out.println("Đây là năm Tuất!");
            case 11 -> System.out.println("Đây là năm Hợi!");
            default -> System.out.println("Lựa chọn không nằm trong danh sách. Vui lòng thử lại!");
        }
    }
}
