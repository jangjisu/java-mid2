package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    public static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());

        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next + "= " + map.get(next) + " ");
        }
        System.out.println();

        //hashMap 에 사용되는 key 는 hashCode(), equals() 를 구현해야한다.
    }
}
