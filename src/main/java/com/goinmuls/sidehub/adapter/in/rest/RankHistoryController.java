package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.application.port.in.GetRankingHistoryUseCase;
import com.goinmuls.sidehub.domain.RankHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/rank-histories")
@RequiredArgsConstructor
@RestController
public class RankHistoryController {

    private final GetRankingHistoryUseCase getRankingHistoryUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<List<RankHistory>> getRankingHistories(@PathVariable("id") Long id) {
        List<RankHistory> rankHistories = getRankingHistoryUseCase.getRankHistories(id);
        return ResponseEntity.status(HttpStatus.OK).body(rankHistories);
    }
}
