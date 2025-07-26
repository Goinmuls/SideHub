package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindMemberProfileResponseDto;
import com.goinmuls.sidehub.application.port.in.FindMemberProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member-profile")
public class MemberProfileController {
    private final FindMemberProfileUseCase findMemberProfileUseCase;

    /**
     * 멤버 프로필 조회
     * @param memberId 멤버 아이디
     * @return 멤버 프로필
     */
    @GetMapping("/by-member/{memberId}")
    public FindMemberProfileResponseDto getMemberProfile(@PathVariable Long memberId) {
        return findMemberProfileUseCase.getMemberProfile(memberId);
    }
}
