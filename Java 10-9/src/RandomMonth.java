import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {
        Random input = new Random();
        for(int i = 1; i <= 1; i++){
            int month = 1+input.nextInt(12);
            switch (month) {
                case 1 -> System.out.println("1. Tháng 1");
                case 2 -> System.out.println("2. Tháng 2");
                case 3 -> System.out.println("3. Tháng 3");
                case 4 -> System.out.println("4. Tháng 4");
                case 5 -> System.out.println("5. Tháng 5");
                case 6 -> System.out.println("6. Tháng 6");
                case 7 -> System.out.println("7. Tháng 7");
                case 8 -> System.out.println("8. Tháng 8");
                case 9 -> System.out.println("9. Tháng 9");
                case 10 -> System.out.println("10. Tháng 10");
                case 11 -> System.out.println("11. Tháng 11");
                case 12 -> System.out.println("12. Tháng 12");
            }
        }
    }
}