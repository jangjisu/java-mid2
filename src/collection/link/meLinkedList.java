package collection.link;

public class meLinkedList<T> {
    private T data;
    private meLinkedList<?> next;

    public meLinkedList() {

    }

    public meLinkedList(T e) {
        this.data = e;
    }

    public int size() {
        int size = 0;
        meLinkedList<?> my = this;
        while(my != null) {
            size ++;
            my = my.next;
        }

        return size;
    }

    public void add(T e) {
        meLinkedList<?> my = this;

        while(my.next != null) {
            my = my.next;
        }

        my.next = new meLinkedList<>(e);
    }

    public T get(int index) {
        meLinkedList<?> my = this;
        for (int i = 0; i < index; i++) {
            my = my.next;
        }

        return (T) my.data;
    }

    @Override
    public String toString() {
        return "meLinkedList{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
