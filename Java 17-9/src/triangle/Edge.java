package triangle;

import java.util.Scanner;

public class Edge {
    private int edge1;
    private int edge2;
    private int edge3;

    public void getEdge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh 1: ");
        edge1 = input.nextInt();
        System.out.println("Nhập độ dài cạnh 2: ");
        edge2 = input.nextInt();
        System.out.println("Nhập độ dài cạnh 3: ");
        edge3 = input.nextInt();
    }

    public int getPerimeter() {
        return edge1 + edge2 + edge3;
    }

    public void displayPerimeter() {
        if (edge1 + edge2 > edge3
                || edge2 + edge3 > edge1
                || edge1 + edge3 > edge2){
            System.out.println("Đây là 3 cạnh của tam giác");
            System.out.println("Chu vi hình tam giác là: " + getPerimeter());
        }
        else{
            System.out.println("Đây không phải 3 cạnh của 1 tam giác");
        }
    }



}
