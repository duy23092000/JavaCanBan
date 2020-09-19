package random.month;

import java.util.Random;

public class RandomNumber {
    private int randomNumber;

    public int getRandomNumber() {
        randomNumber = (int)(Math.random() * 12) + 1;
        return randomNumber;
    }

    public void displayMonth() {
        switch (randomNumber) {
            case 1 -> System.out.println(randomNumber + ". \nTháng 1");
            case 2 -> System.out.println(randomNumber + ". \nTháng 2");
            case 3 -> System.out.println(randomNumber + ". \nTháng 3");
            case 4 -> System.out.println(randomNumber + ". \nTháng 4");
            case 5 -> System.out.println(randomNumber + ". \nTháng 5");
            case 6 -> System.out.println(randomNumber + ". \nTháng 6");
            case 7 -> System.out.println(randomNumber + ". \nTháng 7");
            case 8 -> System.out.println(randomNumber + ". \nTháng 8");
            case 9 -> System.out.println(randomNumber + ". \nTháng 9");
            case 10 -> System.out.println(randomNumber + ". \nTháng 10");
            case 11 -> System.out.println(randomNumber + ". \nTháng 11");
            case 12 -> System.out.println(randomNumber + ". \nTháng 12");
        }
    }
}
