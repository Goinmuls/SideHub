package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.response.GetRankHistoryResponse;

import java.util.List;

public interface GetRankHistoryUseCase {
    List<GetRankHistoryResponse> getRankHistories(Long memberId);
}
