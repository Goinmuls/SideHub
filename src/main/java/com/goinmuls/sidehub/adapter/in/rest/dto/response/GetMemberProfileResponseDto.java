package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import com.goinmuls.sidehub.domain.enums.MemberProfileType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GetMemberProfileResponseDto {
    private Long memberProfileId;
    private Long fileMetaId;
    private Long memberId;
    private MemberProfileType memberProfileType;
    private boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public static GetMemberProfileResponseDto of(
            Long memberProfileId, Long fileMetaId, Long memberId, MemberProfileType memberProfileType,
            boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt
    ) {
        return new GetMemberProfileResponseDto(memberProfileId, fileMetaId, memberId, memberProfileType, isDeleted, createdAt, updatedAt, deletedAt);
    }
}
