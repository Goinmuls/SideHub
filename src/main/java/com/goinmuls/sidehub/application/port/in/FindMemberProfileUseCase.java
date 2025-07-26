package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindMemberProfileResponseDto;

public interface FindMemberProfileUseCase {
    FindMemberProfileResponseDto getMemberProfile(Long memberId);
}
