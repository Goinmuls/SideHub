package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.PostRecruitmentUseCase;
import com.goinmuls.sidehub.application.port.out.PostRecruitmentOutPort;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostRecruitmentApplicationService implements PostRecruitmentUseCase {

    private final PostRecruitmentOutPort postRecruitmentOutPort;

    /**
     * 모집공고 게시
     * @param recruitment 모집공고
     * @return 모집공고 id
     */
    @Transactional(readOnly = true)
    @Override
    public Long createRecruitment(Recruitment recruitment) {
        Long recruitmentId = postRecruitmentOutPort.save(recruitment);

        if (recruitmentId == null) {
            throw  new RuntimeException("모집 공고 등록에 실패했습니다.");
        }

        return recruitmentId;
    }
}
