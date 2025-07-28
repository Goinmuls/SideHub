package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.PostRecruitmentRequestDTO;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.PostRecruitmentResponseDTO;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.RecruitmentResponseDTO;
import com.goinmuls.sidehub.application.port.in.GetRecruitmentUseCase;
import com.goinmuls.sidehub.application.port.in.PostRecruitmentUseCase;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/recruitment")
@RequiredArgsConstructor
@RestController
public class RecruitmentController {

    private final PostRecruitmentUseCase postRecruitmentUseCase;
    private final GetRecruitmentUseCase getRecruitmentUseCase;

    /**
     * 채용 공고 게시
     * @param postRecruitmentRequestDTO
     * @return 모집공고 id
     */
    @PostMapping
    public Long postRecruitment(@RequestBody PostRecruitmentRequestDTO postRecruitmentRequestDTO) {
        Recruitment recruitment = postRecruitmentRequestDTO.toDomain();
        PostRecruitmentResponseDTO createdRecruitmentResponseDTO = postRecruitmentUseCase.createRecruitment(recruitment);
        return createdRecruitmentResponseDTO.getRecruitmentId();
    }

    /**
     * 모집공고 조회
     * @param recruitmentId
     * @return 모집공고
     */
    @GetMapping("/{recruitmentId}")
    public RecruitmentResponseDTO getRecruitment(@PathVariable Long recruitmentId) {
        return getRecruitmentUseCase.getRecruitment(recruitmentId);
    }

    /**
     * 모집공고들 조회
     * @return 모집공고들
     */
    @GetMapping("/all")
    public List<RecruitmentResponseDTO> getAllRecruitments() {
        return getRecruitmentUseCase.getRecruitments();
    }
}
