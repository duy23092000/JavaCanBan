import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        try{
            int p; //Principal
            double r; //rate
            int n; //Period
            Scanner value = new Scanner(System.in);
            System.out.println("Enter Principal:");
            p = value.nextInt();
            System.out.println("Enter Rate:");
            r = value.nextDouble();
            System.out.println("Enter Period:");
            n = value.nextInt();
            double a = Math.pow((r + 1), n);
            double M = (int)(p * r * (a / (a - 1)));
            System.out.println("Your mortgage payment is: " + M + "$" );

        }
        catch (Exception e){
            System.out.println("Error, please run again the program!");

        }



    }
}