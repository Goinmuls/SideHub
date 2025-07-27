package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.request.GetRankingRequest;
import com.goinmuls.sidehub.application.port.in.GetRankingUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.RankingOutPort;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.Ranking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@Transactional
@RequiredArgsConstructor
public class RankingApplicationService implements GetRankingUseCase {

    private final RankingOutPort rankingOutPort;
    private final MemberOutPort memberOutPort;

    /**
     * 사용자 금주 랭킹 조회
     * @param request
     * @return 해당 사용자의 금주 랭킹 정보
     */
    @Override
    public Ranking getRanking(GetRankingRequest request) {

        Member member = memberOutPort.findMember(request.getMemberId());
        if(member == null) {
            throw  new NoSuchElementException("사용자를 찾을 수 없습니다.");
        }

        return rankingOutPort.getRanking(request.getMemberId(), request.getStartOfWeek());
    }
}
