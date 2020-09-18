package leapyear;

import java.util.Scanner;

public class Input {
    private int yearInput;

    public int getYearInput() {
        Scanner input = new Scanner(System.in);
        yearInput = input.nextInt();
        return yearInput;
    }

    public void setYearInput(int yearInput) {
        this.yearInput = yearInput;
    }

    public void display() {
        if (yearInput % 4 == 0) {
            System.out.println("Đây là năm nhuận!");
        }
        else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }
}
