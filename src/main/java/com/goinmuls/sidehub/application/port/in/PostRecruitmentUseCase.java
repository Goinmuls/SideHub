package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.PostRecruitmentResponseDTO;
import com.goinmuls.sidehub.domain.Recruitment;

public interface PostRecruitmentUseCase {
    PostRecruitmentResponseDTO createRecruitment(Recruitment recruitment);
}
