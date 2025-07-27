package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.dto.request.GetStatisticRequest;
import com.goinmuls.sidehub.application.port.in.GetStatisticUseCase;
import com.goinmuls.sidehub.domain.Statistic;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/statistics")
@RequiredArgsConstructor
@RestController
public class StatisticController {

    private final GetStatisticUseCase getStatisticUseCase;

    @GetMapping
    public ResponseEntity<Statistic> getStatistic(GetStatisticRequest request) {
        Statistic statistic = getStatisticUseCase.getStatistic(request);
        return ResponseEntity.status(HttpStatus.OK).body(statistic);
    }
}
