package test18;

import java.util.Scanner;

public class Equation {
    private int a;
    private int b;
    private int c;


    public void setValue() {
        Scanner inputValue = new Scanner(System.in);
        a = inputValue.nextInt();
        b = inputValue.nextInt();
        c = inputValue.nextInt();
    }

    public void getCalculation() {
        double deltaValue = b * b - 4 * a * c;
        if (deltaValue > 0 ){
            int x1 = (int)(-b - Math.sqrt(deltaValue)) / (2 * a);
            int x2 = (int)(-b + Math.sqrt(deltaValue)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt!");
            System.out.println("Nghiệm thứ nhât là: " + x1);
            System.out.println("Nghiệm thứ hai là: " + x2);
        }
        else if (deltaValue == 0) {
            int x = (-b / (2 * a));
            System.out.println("Phương trình có 1 nghiệm kép " + x);
        }
        else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }


}
