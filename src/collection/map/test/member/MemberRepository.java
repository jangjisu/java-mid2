package collection.map.test.member;

import java.util.*;

public class MemberRepository {
    Map<String, Member> memberMap = new HashMap();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (name.equals(member.getName())) {
                return member;
            }
        }
        return null;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MemberRepository that = (MemberRepository) o;
//        return Objects.equals(members, that.members);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(members);
//    }
}
