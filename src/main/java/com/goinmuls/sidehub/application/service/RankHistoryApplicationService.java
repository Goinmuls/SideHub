package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.response.GetRankHistoryResponseDto;
import com.goinmuls.sidehub.application.mapper.RankHistoryMapper;
import com.goinmuls.sidehub.application.port.in.GetRankHistoryUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.RankingHistoryOutPort;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.RankHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RankHistoryApplicationService implements GetRankHistoryUseCase {

    private final RankingHistoryOutPort rankingHistoryOutPort;
    private final RankHistoryMapper rankHistoryMapper;
    private final MemberOutPort memberOutPort;

    /**
     * 사용자 랭킹 추이 히스토리 목록 조회
     * @param memberId
     * @return 해당 사용자의 랭킹 추이 히스토리 목록
     */
    @Override
    public List<GetRankHistoryResponseDto> getRankHistories(Long memberId) {

        Member member = memberOutPort.findMember(memberId);
        if(member == null) {
            throw  new NoSuchElementException("사용자를 찾을 수 없습니다.");
        }

        List<RankHistory> rankHistories = rankingHistoryOutPort.getRankHistories(memberId);

        return rankHistories.stream()
                .map(rankHistoryMapper::toResponse).collect(Collectors.toList());
    }
}
