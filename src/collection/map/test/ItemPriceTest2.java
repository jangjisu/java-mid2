package collection.map.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemPriceTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream().filter(it -> it.getValue() == 1000);

        List<Map.Entry<String, Integer>> list = entryStream.toList();
    }
}
