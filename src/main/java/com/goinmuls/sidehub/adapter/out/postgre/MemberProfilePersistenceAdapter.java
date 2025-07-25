package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.MemberProfileEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.MemberProfileJpaRepository;
import com.goinmuls.sidehub.application.port.out.MemberProfileOutPort;
import com.goinmuls.sidehub.domain.MemberProfile;
import com.goinmuls.sidehub.domain.factory.MemberProfileFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberProfilePersistenceAdapter implements MemberProfileOutPort {
    private final MemberProfileJpaRepository memberProfileJpaRepository;
    private final MemberProfileFactory memberProfileFactory;

    /**
     * 멤버 프로필 조회
     * @param memberId 멤버 아이디
     * @return 멤버 프로필
     */
    @Override
    public MemberProfile findByMemberId(Long memberId) {
        MemberProfileEntity memberEntity = memberProfileJpaRepository.findByMemberId(memberId).orElse(null);
        return memberProfileFactory.fromEntity(memberEntity);
    }
}
