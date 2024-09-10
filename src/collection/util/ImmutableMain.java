package collection.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);

        System.out.println(mutableList.getClass());

        //불변 리스트
        List<Integer> unmodifiableCollection = Collections.unmodifiableList(mutableList);

        System.out.println("unmodifiableCollection.getClass() = " + unmodifiableCollection.getClass());

    }
}
