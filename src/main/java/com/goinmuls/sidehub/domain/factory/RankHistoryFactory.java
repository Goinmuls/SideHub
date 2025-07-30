package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.rankHistory.entity.RankHistoryEntity;
import com.goinmuls.sidehub.domain.RankHistory;
import org.springframework.stereotype.Component;

@Component
public class RankHistoryFactory {

    public RankHistory from (RankHistoryEntity entity) {
        if (entity == null) return null;
        return RankHistory.of(
                entity.getId(),
                entity.getMemberId(),
                entity.getWeekStart(),
                entity.getRankPosition()
        );
    }
}
