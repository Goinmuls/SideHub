package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.ranking.entity.RankingEntity;
import com.goinmuls.sidehub.domain.Ranking;
import org.springframework.stereotype.Component;

@Component
public class RankingFactory {

    public Ranking from (RankingEntity entity) {
        if (entity == null) return null;
        return Ranking.of (
                entity.getId(),
                entity.getWeekStart(),
                entity.getRankPosition(),
                entity.getRankChange()
        );
    }
}
