package collection.array;

import java.util.Arrays;

/**
 * ArrayList 구현
 */
public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size ++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldElement = get(index);
        elementData[index] = element;
        return oldElement;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        //[1,2,3,null,null] 일 경우
        //[1,2,3] 만 반환
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capicity=" + elementData.length;
    }
}
