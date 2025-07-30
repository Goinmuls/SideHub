package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetMemberProfileResponseDto;

public interface GetMemberProfileUseCase {
    GetMemberProfileResponseDto getMemberProfile(Long memberId);
}
