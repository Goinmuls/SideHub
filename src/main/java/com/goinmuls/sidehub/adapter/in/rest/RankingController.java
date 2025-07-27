package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.dto.request.GetRankingRequest;
import com.goinmuls.sidehub.adapter.in.dto.response.GetRankingResponse;
import com.goinmuls.sidehub.application.port.in.GetRankingUseCase;
import com.goinmuls.sidehub.domain.Ranking;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/rankings")
@RequiredArgsConstructor
@RestController
public class RankingController {

    private final GetRankingUseCase getRankingUseCase;

    @GetMapping
    public ResponseEntity<GetRankingResponse> getRanking(GetRankingRequest request) {
        GetRankingResponse ranking = getRankingUseCase.getRanking(request);
        return ResponseEntity.status(HttpStatus.OK).body(ranking);
    }
}
