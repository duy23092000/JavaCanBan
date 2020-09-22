package carddeck;

public class Deck {
    private int rank;
    private int suit;
    private String rankName;
    private String suitName;

    public void randomCard() {
        this.rank = (int)(1 + Math.random() * 13);
        this.suit = (int)(1 + Math.random() * 4);
    }

    public void displayCards() {
        switch (rank){
            case 1 -> rankName = "Át";
            case 2 -> rankName = "2";
            case 3 -> rankName = "3";
            case 4 -> rankName = "4";
            case 5 -> rankName = "5";
            case 6 -> rankName = "6";
            case 7 -> rankName = "7";
            case 8 -> rankName = "8";
            case 9 -> rankName = "9";
            case 10 -> rankName = "10";
            case 11 -> rankName = "J";
            case 12 -> rankName = "Q";
            case 13 -> rankName = "K";
            default -> rankName = "";
        }
        switch (suit){
            case 1 -> suitName = "Cơ";
            case 2 -> suitName = "Rô";
            case 3 -> suitName = "Nhép";
            case 4 -> suitName = "Bích";
            default -> suitName = "";
        }
        System.out.println(rank);
        System.out.println(suit);
        System.out.println("------------------");
        System.out.println("Bạn đã rút lá " + rankName + " " + suitName);

    }
}
