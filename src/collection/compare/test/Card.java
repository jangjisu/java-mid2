package collection.compare.test;

public class Card implements Comparable<Card> {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }

    //Enum 은 자체적으로 적은 순서대로 ordinal 를 가지고 있어 ordinal 을 적을 필요가 없었다...
    public enum Suit {
        SPADE("♠", 1),
        HEART("♥", 2),
        DIAMOND("♦", 3),
        CLOVER("♣", 4);

        private final String icon;
        private final int ordinal;

        Suit(String icon, int ordinal) {
            this.icon = icon;
            this.ordinal = ordinal;
        }

        public String getIcon() {
            return icon;
        }

        public int getOrdinal() {
            return ordinal;
        }
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }
}
