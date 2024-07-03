package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1) bigO 표기법 한번만에 찾을 수 있따.
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: 0(1)
        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: = " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
        //Comment
        //배열의 n 번째를 가져올떄
        //배열의 시작주소에서 한 데이터가 가진 크기 * 몇번째인지 N 만 곱한 주소를 구하면된다.
        //즉, 배열의 크기가 10억건이라고 해도, 10억번째 값을 구하기 위해서는 연산 한번만으로 데이터를 구할 수 있다.


        // bigO 표기법
        //대략적 실행하는데 걸리는 시간의 변화 추세를 이해하기 위한 표기법
        // 크게 O(n), O(log n), O(n^2) 등등..

        //배열에 대이터 추가
    }
}
