package toado2hcn;

import java.util.Scanner;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int length;

    public void getEdge() {
        Scanner inputEdge = new Scanner(System.in);
        width = inputEdge.nextInt();
        length = inputEdge.nextInt();
    }

    public void getCoOr() {
        Scanner inputCoOr = new Scanner(System.in);
        x = inputCoOr.nextInt();
        y = inputCoOr.nextInt();
    }
    
}
