import java.util.Collections;
import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deck gameDeck = new Deck();
        gameDeck.shuffle();

        Card firstDeal = gameDeck.deal();
        System.out.println("First dealed card:" + firstDeal.toString());

        System.out.println("The next card will be:");
        System.out.println("1. Higher");
        System.out.println("2. Lower");
        System.out.println("Enter your choice:");

        int userInput = scanner.nextInt();

        Card secondDeal = gameDeck.deal();

        System.out.println("Second dealed card:" + secondDeal.toString());

        Rank firstDealRank = firstDeal.getRank();
        Rank secondDealRank = secondDeal.getRank();

        int diff = firstDealRank.compareTo(secondDealRank);

        if (diff == 0) {
            System.out.println("This is a TIE. The ranks are the same");
        } else if (diff > 0 && userInput == 2) {
            System.out.println("You Win. The second deal has lower rank");
        } else if (diff > 0 && userInput == 1) {
            System.out.println("You Lost. The second deal has lower rank");
        } else if (diff < 0 && userInput == 2) {
            System.out.println("You Lost. The second deal has bigger rank");
        } else if (diff < 0 && userInput == 1 ) {
            System.out.println("You Win. The second deal has bigger rank");
        }
    }
}
