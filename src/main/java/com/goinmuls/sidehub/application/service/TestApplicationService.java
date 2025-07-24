package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.FindMemberUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.service.MemberDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// todo: 응용 서비스 만들기
@RequiredArgsConstructor
@Transactional
@Service
public class TestApplicationService implements FindMemberUseCase {

    private final MemberOutPort memberOutPort;
    private final MemberDomainService memberDomainService;

    @Override
    public void findMember(Long id) {
        Member member1 = memberOutPort.findMember(id);
        Member member2 = memberOutPort.findMember(id);

        // 2개 이상의 도메인이 서로 상호작용해야만하는 비즈니스 로직을 가질때 도메인 서비스를 사용한다.
        memberDomainService.doSomething(member1, member2);
    }

}
