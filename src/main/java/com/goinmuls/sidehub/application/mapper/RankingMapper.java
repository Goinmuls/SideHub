package com.goinmuls.sidehub.application.mapper;

import com.goinmuls.sidehub.adapter.in.dto.response.GetRankingResponse;
import com.goinmuls.sidehub.domain.Ranking;
import org.springframework.stereotype.Component;

@Component
public class RankingMapper {

    /**
     * 랭킹 도메인 -> 랭킹 응답 객체 변환
     * @param ranking (도메인)
     * @return GetRankingResponse (응답 객체)
     */
    public GetRankingResponse toResponse(Ranking ranking) {
        if (ranking == null) {
            return null;
        }

        return GetRankingResponse.of(
                ranking.getId(),
                ranking.getWeekStart(),
                ranking.getRankPosition(),
                ranking.getRankChange()
        );
    }
}
