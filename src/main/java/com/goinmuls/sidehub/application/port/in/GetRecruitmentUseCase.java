package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.RecruitmentResponseDTO;

import java.util.List;

public interface GetRecruitmentUseCase {
    RecruitmentResponseDTO getRecruitment(Long id);
    List<RecruitmentResponseDTO> getRecruitments();
}
