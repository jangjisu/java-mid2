package collection.list.test;

import java.util.Arrays;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> students = Arrays.asList(new Integer[]{90, 80, 70, 60, 50});

        int total = 0;
        for (Integer student : students) {
            total += student;
        }

        double average = total/ students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
