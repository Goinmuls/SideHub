package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.RecruitmentJpaRepository;
import com.goinmuls.sidehub.application.port.out.RecruitmentOutPort;
import com.goinmuls.sidehub.domain.Recruitment;
import com.goinmuls.sidehub.domain.factory.RecruitmentFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class RecruitmentPersistenceAdapter implements RecruitmentOutPort {

    private final RecruitmentJpaRepository recruitmentJpaRepository;
    private final RecruitmentFactory recruitmentFactory;

    /**
     * 모집공고 조회
     * @param recruitmentId
     * @return 모집공고
     */
    @Override
    public Recruitment findByRecruitmentId(Long recruitmentId) {
        RecruitmentEntity recruitmentEntity = recruitmentJpaRepository
                .findByRecruitmentId(recruitmentId)
                .orElse(null);
        return recruitmentFactory.fromEntity(recruitmentEntity);
    }

    /**
     * 모집공고들 조회
     * @return 모집공고들
     */
    @Override
    public List<Recruitment> findAllByRecruitmentId() {
        List<RecruitmentEntity> recruitmentEntities = recruitmentJpaRepository.findAllByRecruitmentId();

        return recruitmentEntities.stream()
                .map(recruitmentFactory::fromEntity)
                .toList();
    }
}
