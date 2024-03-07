package com.tofhdnsakdmatotlwkr.service;

import com.tofhdnsakdmatotlwkr.model.Member;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tofhdnsakdmatotlwkr.repository.MemberRepository;

@Service
public class JoinService {

    private MemberRepository memberRepository;
    private EncryptService encryptService;

    @Autowired
    public JoinService(MemberRepository memberRepository, EncryptService encryptService) {
        this.memberRepository = memberRepository;
        this.encryptService = encryptService;
    }

    public int join(Member member) {
        int result = 0;
        member.setPassword(encryptService.passEncode(member.getPassword()));
        Member resultEntity = memberRepository.save(member);
        if (resultEntity != null) {
            result = 1;
            System.out.println("성공");
        }
        return result;
    }
}
