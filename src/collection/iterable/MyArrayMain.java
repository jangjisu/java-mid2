package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[] {1,2,3,4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        //추가
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }

        //아래 위 코드는 같은 코드.. 런타임 시점에 바꿔준다.


    }
}
