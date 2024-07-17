package collection.link;

import org.w3c.dom.ls.LSOutput;

public class OwnLinkedListTest {
    public static void main(String[] args) {
        OwnLinkedList<String> ll = new OwnLinkedList<>();

        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.add("5");

        System.out.println(ll);

        System.out.println(ll.get(3));

        ll.add(3, "100");

        System.out.println(ll);

        ll.set(3, "50");
        System.out.println(ll);

        ll.remove(0);

        System.out.println(ll);

        ll.remove(2);

        System.out.println(ll);

        System.out.println(ll.indexOf("2"));

        System.out.println(ll.indexOf("5"));

        System.out.println(ll.indexOf("1000"));
    }
}
