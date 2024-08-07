package collection.set;

import java.util.Arrays;

public class HashStart4 {
    private static final int CAPACITY = 10;
    
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;

        Integer result = inputArray[hashIndex(searchValue)]; //0(1)
        System.out.println("result = " + result);
    }

    private static void add(Integer[] inputArray, int value) {
        inputArray[hashIndex(value)] = value;
    }

    static int hashIndex(int num) {
        return num % CAPACITY;
    }
}
