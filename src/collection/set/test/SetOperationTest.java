package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = getHap(set1, set2);
        System.out.println(union);

        Set<Integer> intersection = getGyo(set1, set2);
        System.out.println(intersection);

        Set<Integer> difference = getCha(set1, set2);
        System.out.println(difference);

    }

    private static <T> Set<T> getHap(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();

        result.addAll(set1);

        result.addAll(set2);

        return result;
    }

    private static <T> Set<T> getGyo(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();

        result.addAll(set1);
        result.retainAll(set2);

        return result;
    }

    private static <T> Set<T> getCha(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();

        result.addAll(set1);
        result.removeAll(set2);

        return result;


    }


}
