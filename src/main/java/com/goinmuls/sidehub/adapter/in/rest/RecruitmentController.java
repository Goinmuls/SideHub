package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.CreateRecruitmentRequestDTO;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.PostRecruitmentResponseDTO;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.RecruitmentResponseDTO;
import com.goinmuls.sidehub.adapter.in.rest.mapper.RecruitmentMapper;
import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.application.port.in.GetRecruitmentUseCase;
import com.goinmuls.sidehub.application.port.in.PostRecruitmentUseCase;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/recruitment")
@RequiredArgsConstructor
@RestController
public class RecruitmentController {

    private final PostRecruitmentUseCase postRecruitmentUseCase;
    private final GetRecruitmentUseCase getRecruitmentUseCase;
    private final RecruitmentMapper recruitmentMapper;

    /**
     * 채용 공고 게시
     * @param createRecruitmentRequestDTO
     * @return 모집공고 id
     */
    @PostMapping
    public ResponseEntity<RecruitmentEntity> postRecruitment(@RequestBody CreateRecruitmentRequestDTO createRecruitmentRequestDTO) {
        Recruitment recruitment = recruitmentMapper.toDomain(createRecruitmentRequestDTO);
        PostRecruitmentResponseDTO createdRecruitmentResponseDTO = postRecruitmentUseCase.createRecruitment(recruitment);
        return ResponseEntity.ok(recruitmentMapper.toEntity(createdRecruitmentResponseDTO));
    }

    /**
     * 모집공고 조회
     * @param recruitmentId
     * @return 모집공고
     */
    @GetMapping("/{recruitmentId}")
    public ResponseEntity<RecruitmentResponseDTO> getRecruitment(@PathVariable Long recruitmentId) {
        return ResponseEntity.ok(getRecruitmentUseCase.getRecruitment(recruitmentId));
    }

    /**
     * 모집공고들 조회
     * @return 모집공고들
     */
    @GetMapping("/all")
    public ResponseEntity<List<RecruitmentResponseDTO>> getAllRecruitments() {
        return ResponseEntity.ok(getRecruitmentUseCase.getRecruitments());
    }
}
