package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.MemberEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.MemberJpaRepository;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.factory.MemberFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MemberPersistenceAdapter implements MemberOutPort {

    private final MemberJpaRepository memberJpaRepository;
    private final MemberFactory memberFactory;

    @Override
    public Member findMember(Long id) {
        MemberEntity memberEntity = memberJpaRepository.findById(id)
                .orElse(null);

        return memberFactory.from(memberEntity);
    }

}
