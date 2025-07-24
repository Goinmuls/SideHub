package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Member;

public interface MemberOutPort {

    Member findMember(Long id);

}
