package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");

        //원하는 위치에 추가
        list.add(3, "addList"); //O(1)

        list.add(0, "addFirst"); //O(n)

        //삭제
        Object remove = list.remove(4);
        System.out.println("removed(4) = " + remove); //O(1)
        System.out.println(list);

        Object remove1 = list.remove(0);
        System.out.println("removed(0) = " + remove1); //O(n)
        System.out.println(list);


    }
}
