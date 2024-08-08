package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 3);
        add(buckets, 4);
        add(buckets, 15);
        add(buckets, 115);
        add(buckets, 165);

        System.out.println(Arrays.toString(buckets));

        System.out.println(contains(buckets, 125));
        System.out.println(contains(buckets, 165));


    }

    public static void add(LinkedList<Integer>[] buckets, int value) {
        int index = hashIndex(value);

        if(!buckets[index].contains(value)) {
            buckets[index].add(value);
        }


    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    public static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int index = hashIndex(value);

        return buckets[index].contains(value);
    }



}
