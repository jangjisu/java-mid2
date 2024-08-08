package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class SelfHashSetV2<E> {
    static final int DEFAULT_INITAL_CAPACITY = 16;

    LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITAL_CAPACITY;

    public SelfHashSetV2() {
        initBuckets();
    }

    public SelfHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if(bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size ++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];

        boolean result = bucket.remove(value);
        if(result) size --;
        return result;
    }

    private int hashIndex(E value) {
        return value.hashCode() % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

}
