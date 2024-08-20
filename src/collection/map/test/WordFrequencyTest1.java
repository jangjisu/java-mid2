package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> wordMap = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) +1);
        }

        System.out.println(wordMap);
    }
}
