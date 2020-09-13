import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {
        int month;
        Random input = new Random();
        for(int i = 1; i <= 1; i++){
            month = 1+input.nextInt(12);
            switch (month){
                case 1:
                    System.out.println("1. Tháng 1");
                    break;
                case 2:
                    System.out.println("2. Tháng 2");
                    break;
                case 3:
                    System.out.println("3. Tháng 3");
                    break;
                case 4:
                    System.out.println("4. Tháng 4");
                    break;
                case 5:
                    System.out.println("5. Tháng 5");
                    break;
                case 6:
                    System.out.println("6. Tháng 6");
                    break;
                case 7:
                    System.out.println("7. Tháng 7");
                    break;
                case 8:
                    System.out.println("8. Tháng 8");
                    break;
                case 9:
                    System.out.println("9. Tháng 9");
                    break;
                case 10:
                    System.out.println("10. Tháng 10");
                    break;
                case 11:
                    System.out.println("11. Tháng 11");
                    break;
                case 12:
                    System.out.println("12. Tháng 12");
                    break;
            }
        }
    }
}