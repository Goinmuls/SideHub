package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindMemberProfileResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.MemberProfileMapper;
import com.goinmuls.sidehub.application.port.in.FindMemberProfileUseCase;
import com.goinmuls.sidehub.application.port.out.MemberProfileOutPort;
import com.goinmuls.sidehub.domain.MemberProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberProfileApplicationService implements FindMemberProfileUseCase {
    private final MemberProfileOutPort memberProfileOutPort;
    private final MemberProfileMapper memberProfileMapper;

    /**
     * 멤버 프로필 조회
     * @param memberId 멤버 아이디
     * @return 멤버 프로필
     */
    @Override
    public FindMemberProfileResponseDto getMemberProfile(Long memberId) {
        MemberProfile memberProfile = memberProfileOutPort.findByMemberId(memberId);

        if (memberProfile == null) {
            throw new NoSuchElementException("멤버 프로필을 찾을 수 없습니다.");
        }
        return memberProfileMapper.toFindResponseDto(memberProfile);
    }
}
