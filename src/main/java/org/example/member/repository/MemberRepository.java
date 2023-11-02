package org.example.member.repository;

import org.example.member.entity.Member;
import org.example.util.Util;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<Member> memberList = new ArrayList<>();

    public void init() {
        Member admin = new Member(1, "admin", "",  Util.nowDateTime());
        memberList.add(admin);
        Member test1 = new Member(2, "test1", "1234",  Util.nowDateTime());
        memberList.add(test1);
        Member user1 = new Member(3, "user1", "1234",  Util.nowDateTime());
        memberList.add(user1);
    }

    public Member getMemberFindByUserId(String userId) {
        for (Member member : memberList) {
            if (member.getUserId().equals(userId)) {
                return member;
            }
        }
        return null;
    }

    public void sign(String userId, String password) {
        Member member = new Member(userId, password, Util.nowDateTime());
        memberList.add(member);
    }
}
