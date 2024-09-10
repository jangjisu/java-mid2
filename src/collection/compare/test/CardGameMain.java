package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
//        List<Card> cardList = new ArrayList<>();
//
//        makeCard(cardList);
//
//        List<Card> player1 = getCard(cardList);
//        int player1Sum = getSum(player1);
//        System.out.println("플레이어1의 카드:" + sortCard(player1) + ", 합계:" + player1Sum);
//        List<Card> player2 = getCard(cardList);
//        int player2Sum = getSum(player2);
//        System.out.println("플레이어2의 카드:" + sortCard(player2) + ", 합계:" + player2Sum);
//
//        if (player1Sum > player2Sum) {
//            System.out.println("플레이어1 승리");
//        } else if (player1Sum == player2Sum) {
//            System.out.println("무승부");
//        } else {
//            System.out.println("플레이어2 승리");
//        }

        Deck deck = new Deck();
        Player player1 = new Player("플레이어1", new ArrayList<>());
        Player player2 = new Player("플레이어2", new ArrayList<>());

        for (int i = 0; i <5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2);

        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
            return player1;
        } else if (sum1 == sum2) {
            return null;
        } else {
            return player2;
        }
    }

    private static List<Card> getCard(List<Card> cardList) {
        Collections.shuffle(cardList);

        return cardList.subList(0, 5);
    }

    private static List<Card> sortCard(List<Card> cardList) {
        Comparator<Card> combinedComparator = new CardNumberComparator().thenComparing(new CardPatternComparator());
        cardList.sort(combinedComparator);
        return cardList;
    }

    private static int getSum(List<Card> cardList) {
        return cardList.stream().mapToInt(it -> it.getRank()).sum();
    }

    private static void makeCard(List<Card> cardList) {
        for (int i = 1; i < 14; i++) {
            cardList.add(new Card(i, Card.Suit.SPADE));
            cardList.add(new Card(i, Card.Suit.HEART));
            cardList.add(new Card(i, Card.Suit.DIAMOND));
            cardList.add(new Card(i, Card.Suit.CLOVER));
        }
    }
}
