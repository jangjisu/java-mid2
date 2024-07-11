package collection.link;

public class meLinkedListV1Main {
    public static void main(String[] args) {
        meLinkedList my = new meLinkedList("a");

        my.add("b");
        my.add("c");

        System.out.println(my.size());

        meLinkedList my2 = new meLinkedList();

        my2.add("a");
        my2.add("a");
        my2.add("a");

        System.out.println(my2.size());

        System.out.println(my2);
    }
}
