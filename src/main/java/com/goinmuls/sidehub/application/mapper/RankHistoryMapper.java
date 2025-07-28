package com.goinmuls.sidehub.application.mapper;

import com.goinmuls.sidehub.adapter.in.dto.response.GetRankHistoryResponseDto;
import com.goinmuls.sidehub.domain.RankHistory;
import org.springframework.stereotype.Component;

@Component
public class RankHistoryMapper {

    /**
     * 랭킹 변화 히스토리 도메인 -> 랭킹 변화 히스토리 응답 객체 변환
     * @param rankHistory (도메인)
     * @return GetRankHistoryResponse (응답 객체)
     */
    public GetRankHistoryResponseDto toResponse(RankHistory rankHistory) {
        if (rankHistory == null) {
            return null;
        }

        return GetRankHistoryResponseDto.of(
                rankHistory.getId(),
                rankHistory.getWeekStart(),
                rankHistory.getRankPosition(),
                rankHistory.getContributionScore()
        );
    }
}
