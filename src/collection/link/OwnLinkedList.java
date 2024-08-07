package collection.link;

public class OwnLinkedList<E> {
    private Node<E> first;
    private int size = 0;
    //노드 추가
    public void add(E element) {
        if (first == null) {
            first = new Node<>(element);
        } else {
            Node<E> getNode = getLastNode();
            getNode.next = new Node<>(element);
        }
        size ++;
    }

    private Node<E> getLastNode() {
        Node<E> getNode = first;
        while (getNode.next != null) {
            getNode = getNode.next;
        }
        return getNode;
    }

    private Node<E> getIndexNode(int index) {
        Node<E> getNode = first;
        for (int i = 0; i < index; i++) {
            getNode = getNode.next;
        }
        return getNode;
    }

    //노드 추가 index로
    public void add(int index, E element) {
        Node<E> getNode = first;
        if (index == 0) {
            first = new Node<>(element);
            first.next = getNode;
        } else {
            Node<E> prevNode = getIndexNode(index - 1);
            Node<E> nextNode = prevNode.next;

            prevNode.next = new Node<>(element);
            prevNode.next.next = nextNode;
        }
        size ++;
    }

    // n 번째에 값 변경
    public void set(int index, E element) {
        getIndexNode(index).item = element;
    }

    //n 번째 제거
    public void remove(int index) {
        if(index == 0) {
            first = first.next;
        } else {
            Node<E> prevNode = getIndexNode(index - 1);
            prevNode.next = prevNode.next.next;
        }
        size --;

    }

    //n 번째 값 가져오기
    public E get(int index) {
        Node<E> getNode = first;
        for (int i = 0; i < index; i++) {
            getNode = getNode.next;
        }
        return getNode.item;
    }

    //일치 하는 값의 위치 찾기
    public int indexOf(E element) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if(element.equals(x.item)) {
                return index;
            }
            index ++;
        }

        return -1;
    }

    //크기 가져오기
    public int size() {
        return size;
    }

    public String toString() {
        return "OwnLinkedList{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    public static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }
}
