package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.GetRankingHistoryUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.RankingHistoryOutPort;
import com.goinmuls.sidehub.domain.RankHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RankHistoryApplicationService implements GetRankingHistoryUseCase {

    private final RankingHistoryOutPort rankingHistoryOutPort;
    private final MemberOutPort memberOutPort;

    public List<RankHistory> getRankHistories(Long memberId) {

        Optional.ofNullable(memberOutPort.findMember(memberId))
                .orElseThrow(() -> new NoSuchElementException("사용자를 찾을 수 없습니다."));

        return rankingHistoryOutPort.getRankHistories(memberId);
    }
}
