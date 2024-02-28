package totlwkr.tofhdnsakdmatotlwkr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import totlwkr.tofhdnsakdmatotlwkr.model.Member;
import totlwkr.tofhdnsakdmatotlwkr.repository.MemberRepository;

@Service
public class JoinService {

    private MemberRepository memberRepository;

    @Autowired
    public JoinService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    public int join(Member member) {
//        int result = memberRepository.
//        return result;
//    }
}
