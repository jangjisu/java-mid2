package collection.compare.test;

import java.util.Comparator;

public class CardNumberComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getRank(), o2.getRank());
    }
}
