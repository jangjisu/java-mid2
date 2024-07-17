package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        String s = stringList.get(0);
        System.out.println(s);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Integer i = integerList.get(0);
        System.out.println(i);

    }
}
