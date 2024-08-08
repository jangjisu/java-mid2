package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        //HashCode 에는 마이너스 값이 들어올 수 있다.
        Integer ai = -1;
        System.out.println("ai.hashCode() = " + ai.hashCode());


        Member member1 = new Member("A");
        Member member2 = new Member("A");

        //equals, hashcode를 오버라이딩 하지 않은 경우와 경우를 비교
        System.out.println("member1 == member2 = " + (member1 == member2));
        System.out.println(member1.equals(member2));

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
