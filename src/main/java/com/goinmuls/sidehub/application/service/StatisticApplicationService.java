package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.request.GetStatisticRequest;
import com.goinmuls.sidehub.adapter.in.dto.response.GetStatisticResponse;
import com.goinmuls.sidehub.application.mapper.StatisticMapper;
import com.goinmuls.sidehub.application.port.in.GetStatisticUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.StatisticOutPort;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.Statistic;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@Transactional
@RequiredArgsConstructor
public class StatisticApplicationService implements GetStatisticUseCase {

    private final StatisticOutPort statisticOutPort;
    private final StatisticMapper statisticMapper;
    private final MemberOutPort memberOutPort;

    /**
     * 사용자 금주 통계 조회
     * @param request
     * @return 해당 사용자의 금주 통계 정보
     */
    @Override
    public GetStatisticResponse getStatistic(GetStatisticRequest request) {

        Member member = memberOutPort.findMember(request.getMemberId());
        if(member == null) {
            throw  new NoSuchElementException("사용자를 찾을 수 없습니다.");
        }

        Statistic statistic = statisticOutPort.getStatistic(request.getMemberId(), request.getStartOfWeek());

        return statisticMapper.toResponse(statistic);
    }
}
