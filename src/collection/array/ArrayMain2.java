package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));


        arr = addFirst(arr, 3);

        System.out.println(Arrays.toString(arr));

        arr = addIndex(arr, 2, 4);

        System.out.println(Arrays.toString(arr));

        arr = addLast(arr, 5);

        System.out.println(Arrays.toString(arr));
    }

    //배열의 첫번째 위치에 추가
    public static int[] addFirst(int[] arr, int newValue) {
        //O(n)
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = newValue;

        return arr;
    }

    //index 위치에 추가
    public static int[] addIndex(int[] arr, int index, int newValue) {
        //O(n)/2 정도? 크게보면 O(n)
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = newValue;

        return arr;
    }

    public static int[] addLast(int[] arr, int newValue) {
        //O(1)
        arr[arr.length-1] = newValue;

        return arr;
    }

    //Comment
    //배열의 한계
    //배열 생성시점에 배열의 크기를 정해야한다. 동적으로 변경할 수 없다.
    //데이터를 추가하기가 불편하다.


}
