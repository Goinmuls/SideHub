package com.goinmuls.sidehub.domain.service;

import com.goinmuls.sidehub.domain.Member;
import org.springframework.stereotype.Service;

// todo: 이 서비스도 POJO다.
@Service
public class MemberDomainService {

    // todo: 여러개의 애그리거트간의 비즈니스는 여기서 해라
    // 도메인간의 상호작용만 처리한다.
    // todo: Member, Post

    public void doSomething(Member member1, Member member2) {
    }

}
