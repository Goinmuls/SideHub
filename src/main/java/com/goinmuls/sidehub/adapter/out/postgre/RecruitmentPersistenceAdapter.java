package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.RecruitmentMapper;
import com.goinmuls.sidehub.adapter.out.postgre.repository.RecruitmentJpaRepository;
import com.goinmuls.sidehub.application.port.out.RecruitmentOutPort;
import com.goinmuls.sidehub.domain.Recruitment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RecruitmentPersistenceAdapter implements RecruitmentOutPort {

    private final RecruitmentJpaRepository recruitmentJpaRepository;
    private RecruitmentMapper recruitmentMapper;

    /**
     * 모집공고 게시
     * @param recruitment 모집공고
     * @return 모집공고 id
     */
    @Override
    public Long post(Recruitment recruitment) {
        RecruitmentEntity recruitmentEntity = recruitmentMapper.toEntity(recruitment);
        recruitmentJpaRepository.save(recruitmentEntity);
        return recruitment.getRecruitmentId();
    }
}
