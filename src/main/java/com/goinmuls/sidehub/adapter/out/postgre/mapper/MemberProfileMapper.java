package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetMemberProfileResponseDto;
import com.goinmuls.sidehub.domain.MemberProfile;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileMapper {

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param memberProfile 도메인
     * @return 조회 응답 dto
     */
    public GetMemberProfileResponseDto toFindResponseDto(MemberProfile memberProfile) {
        if (memberProfile == null) {
            return null;
        }

        return GetMemberProfileResponseDto.of(
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
