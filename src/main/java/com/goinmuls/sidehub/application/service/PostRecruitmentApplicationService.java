package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.PostRecruitmentResponseDTO;
import com.goinmuls.sidehub.adapter.in.rest.mapper.Mapper;
import com.goinmuls.sidehub.application.port.in.PostRecruitmentUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.PostRecruitmentOutPort;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostRecruitmentApplicationService implements PostRecruitmentUseCase {

    private final PostRecruitmentOutPort postRecruitmentOutPort;
    private final MemberOutPort memberOutPort;
    private final Mapper mapper;

    /**
     * 모집공고 게시
     * @param recruitment 모집공고
     * @return 모집공고 id
     */
    @Transactional
    @Override
    public PostRecruitmentResponseDTO createRecruitment(Recruitment recruitment) {

        if (recruitment == null) {
            throw new RuntimeException("생성할 모집 공고가 없습니다.");
        }

        Member foundMember = memberOutPort.findMember(recruitment.getRecruitmentId());

        if (foundMember == null) {
            throw new RuntimeException("가입된 회원이 아닙니다.");
        }

        Recruitment savedRecruitment = postRecruitmentOutPort.save(recruitment);

        if (savedRecruitment == null) {
            throw  new RuntimeException("모집 공고 등록에 실패했습니다.");
        }

        return mapper.toDto(savedRecruitment);
    }
}
