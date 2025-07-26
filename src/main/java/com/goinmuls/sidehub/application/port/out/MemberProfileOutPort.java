package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.MemberProfile;

public interface MemberProfileOutPort {
    MemberProfile findByMemberId(Long memberId);
}
