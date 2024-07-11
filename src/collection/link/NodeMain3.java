package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        int idx = 2;
        Node getNode = getNode(first, idx);
        System.out.println("getNode = " + getNode.item);

        //데이터 추가하기
        add(first, "D");
        System.out.println("first = " + first);
        add(first, "E");
        System.out.println("first = " + first);
        add(first, "F");
        System.out.println("first = " + first);

    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);

        lastNode.next = new Node(param);
    }

    private static Node getNode(Node node, int idx) {
        Node x = node;
        for (int i = 0; i < idx; i++) {
            x = x.next;
        }

        return x;
    }

    private static void printAll(Node node) {
        Node x = node;

        while (x != null) {
            System.out.println(x.item);
            x = x.next;

        }
    }
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }


}
