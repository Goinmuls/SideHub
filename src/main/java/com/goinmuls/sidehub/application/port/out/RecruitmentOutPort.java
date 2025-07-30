package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Recruitment;

import java.util.List;

public interface RecruitmentOutPort {
    Recruitment findByRecruitmentId(Long recruitmentId);
    List<Recruitment> findAllByRecruitmentId();
}
