package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.PostRecruitmentMapper;
import com.goinmuls.sidehub.adapter.out.postgre.repository.RecruitmentJpaRepository;
import com.goinmuls.sidehub.application.port.out.PostRecruitmentOutPort;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PostRecruitmentPersistenceAdapter implements PostRecruitmentOutPort {

    private final RecruitmentJpaRepository recruitmentJpaRepository;
    private PostRecruitmentMapper postRecruitmentMapper;

    /**
     * 모집공고 게시
     * @param recruitment 모집공고
     * @return 모집공고 id
     */
    @Override
    public Long post(Recruitment recruitment) {
        RecruitmentEntity recruitmentEntity = postRecruitmentMapper.toEntity(recruitment);
        recruitmentJpaRepository.save(recruitmentEntity);
        return recruitment.getRecruitmentId();
    }
}
