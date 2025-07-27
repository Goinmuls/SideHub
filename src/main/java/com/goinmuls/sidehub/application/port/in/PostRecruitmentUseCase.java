package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.domain.Recruitment;

public interface PostRecruitmentUseCase {
    Long postRecruitment(Recruitment recruitment);
}
