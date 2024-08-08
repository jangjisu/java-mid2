package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");
        Member nullMember = new Member(null);

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());
        System.out.println("nullMember.hashCode() = " + nullMember.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        set.add(nullMember);

        System.out.println("set = " + set);

        //검색
        Member searchvalue = new Member("JPA");
        boolean result = set.contains(searchvalue);
        System.out.println("set.contains(" + searchvalue + ") = " + result);




    }

}
