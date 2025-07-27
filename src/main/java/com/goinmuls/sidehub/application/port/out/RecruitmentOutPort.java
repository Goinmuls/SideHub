package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Recruitment;

public interface RecruitmentOutPort {

    Long post(Recruitment recruitment);
}
