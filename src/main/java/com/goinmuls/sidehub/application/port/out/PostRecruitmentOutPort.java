package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Recruitment;

public interface PostRecruitmentOutPort {
    Long post(Recruitment recruitment);
}
