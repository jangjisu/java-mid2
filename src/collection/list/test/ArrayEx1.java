package collection.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEx1 {
    public static void mainEx(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }

    public static void main(String[] args) {
        String abcc = "65";


        abcc = "1";

        abcc = "3";
    }
}
