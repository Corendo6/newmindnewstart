package com.tofhdnsakdmatotlwkr.service;

import com.tofhdnsakdmatotlwkr.model.Member;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tofhdnsakdmatotlwkr.repository.MemberRepository;

@Service
public class JoinService {

    private MemberRepository memberRepository;

    @Autowired
    public JoinService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public int join(Member member) {
        int result = 0;
        Member resultEntity = memberRepository.save(member);
        if (resultEntity != null) {
            result = 1;
            System.out.println("성공");
        }
        return result;
    }
}
