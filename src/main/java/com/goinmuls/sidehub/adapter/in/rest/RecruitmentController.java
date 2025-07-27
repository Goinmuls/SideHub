package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.application.port.in.PostRecruitmentUseCase;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/recruitment")
@RequiredArgsConstructor
@RestController
public class RecruitmentController {

    private final PostRecruitmentUseCase postRecruitmentUseCase;

    /**
     * 채용 공 게시
     * @param recruitment
     * @return 모집공고 id
     */
    @PostMapping
    public Long postRecruitment(@RequestBody Recruitment recruitment) {
        return postRecruitmentUseCase.postRecruitment(recruitment);
    }
}
