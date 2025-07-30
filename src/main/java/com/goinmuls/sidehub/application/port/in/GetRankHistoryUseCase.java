package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.response.GetRankHistoryResponseDto;

import java.util.List;

public interface GetRankHistoryUseCase {
    List<GetRankHistoryResponseDto> getRankHistories(Long memberId);
}
