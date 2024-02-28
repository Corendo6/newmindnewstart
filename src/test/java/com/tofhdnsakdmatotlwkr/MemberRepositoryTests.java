package com.tofhdnsakdmatotlwkr;

import com.tofhdnsakdmatotlwkr.model.Member;
import com.tofhdnsakdmatotlwkr.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testClass() {
        System.out.println("______" + memberRepository.getClass().getName());
    }

    @Test
    public void testInsertDummies() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Member member = new Member();
            member.setMemberId("테스트_" + i );
            member.setPassword(String.valueOf(i));
            memberRepository.save(member);
        });
    }
}
