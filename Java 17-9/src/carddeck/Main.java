package carddeck;

// Ace, 2, 3 -->K"
//Co Ro Tep Bich
//sinh ra ngau nhien 1 so tu 1 - 52;
//kiem tra so ngau nhien random
//neu ma random % 13 == 1 --> Ace;
// Du 12 --> Q, du 11 --> J, du 0 --K, Du random --> random
// random / 13

public class Main {
    public static void main(String[] args) {
        var deck1 = new Deck();
        deck1.randomCard();
        deck1.displayCards();
        System.out.println();
    }
}
