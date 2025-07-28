package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.dto.request.CreateWeeklyReportRequestDto;
import com.goinmuls.sidehub.application.port.in.CreateWeeklyReportUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/weekly-reports")
@RequiredArgsConstructor
@RestController
public class WeeklyReportController {

    private final CreateWeeklyReportUseCase createWeeklyReportUseCase;

    @PostMapping
    public ResponseEntity<Void> createWeeklyReport(@RequestBody CreateWeeklyReportRequestDto createWeeklyReportRequestDto) {
        createWeeklyReportUseCase.createWeeklyReport(createWeeklyReportRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
