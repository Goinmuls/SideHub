package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindMemberProfileResponseDto;
import com.goinmuls.sidehub.domain.MemberProfile;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class MemberProfileMapper {

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param memberProfile 도메인
     * @return 조회 응답 dto
     */
    public FindMemberProfileResponseDto toFindResponseDto(MemberProfile memberProfile) {
        if (ObjectUtils.isEmpty(memberProfile)) {
            return null;
        }

        return FindMemberProfileResponseDto.of(
                memberProfile.getMemberProfileId(),
                memberProfile.getFileMetaId(),
                memberProfile.getMemberId(),
                memberProfile.getMemberProfileType(),
                memberProfile.isDeleted(),
                memberProfile.getCreatedAt(),
                memberProfile.getUpdatedAt(),
                memberProfile.getDeletedAt()
        );
    }
}
