package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.MemberProfileEntity;
import com.goinmuls.sidehub.domain.MemberProfile;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param memberEntity 엔티티
     * @return 도메인
     */
    public MemberProfile fromEntity(MemberProfileEntity memberEntity) {
        if (memberEntity == null) {
            return null;
        }

        return MemberProfile.of(
                memberEntity.getMemberProfileId(),
                memberEntity.getFileMetaId(),
                memberEntity.getMemberId(),
                memberEntity.getMemberProfileType(),
                memberEntity.isDeleted(),
                memberEntity.getCreatedAt(),
                memberEntity.getUpdatedAt(),
                memberEntity.getDeletedAt()
        );
    }
}
