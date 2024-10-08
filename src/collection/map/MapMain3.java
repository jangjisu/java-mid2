package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1
        studentMap.putIfAbsent("studentA", 100);
        System.out.println(studentMap);

        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);

    }
}
