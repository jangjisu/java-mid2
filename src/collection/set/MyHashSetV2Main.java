package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        set.add("PRNCE");
        set.add("FRT");
        set.add("PRNCE");
        set.add("AFW");
        set.add("ASSS");
        set.add("VV");
        set.add("9");
        set.add("10");
        set.add(new Member("10"));
        System.out.println(set);

        //검색
        String searchValue = "10";
        boolean result = set.contains(searchValue);
        System.out.println("set.result(" + searchValue +") = " + result);

        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println(set);
    }
}
