package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.RecruitmentResponseDTO;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.RecruitmentMapper;
import com.goinmuls.sidehub.application.port.in.GetRecruitmentUseCase;
import com.goinmuls.sidehub.application.port.out.RecruitmentOutPort;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RecruitmentApplicationService implements GetRecruitmentUseCase {

    private final RecruitmentOutPort recruitmentOutPort;
    private final RecruitmentMapper recruitmentMapper;

    @Override
    public List<RecruitmentResponseDTO> getRecruitments() {
        List<Recruitment> recruitments = recruitmentOutPort.findAllByRecruitmentId();

        if (CollectionUtils.isEmpty(recruitments)) {
            throw new NoSuchElementException("모집 공고들을 찾을 수 없습니다.");
        }

        return recruitments.stream()
                .map(recruitmentMapper::toRecruitmentResponseDTO)
                .toList();
    }

    @Override
    public RecruitmentResponseDTO getRecruitment(Long id) {
        Recruitment recruitment = recruitmentOutPort.findByRecruitmentId(id);

        if (recruitment == null) {
            throw new NoSuchElementException("해당 모집 공고를 찾을 수 없습니다.");
        }

        return recruitmentMapper.toRecruitmentResponseDTO(recruitment);
    }
}
