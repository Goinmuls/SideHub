package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.application.port.in.CreateAttendanceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/attendances")
@RequiredArgsConstructor
@RestController
public class AttendanceController {
    private final CreateAttendanceUseCase createAttendanceUseCase;

    /**
     * 출석체크 insert 컨트롤러
     * @param memberId : 사용자 고유 id
     * @return 나중에...
     */
    @PostMapping("/check")
    public ResponseEntity<Void> checkAttendance(@RequestParam Long memberId) {
        createAttendanceUseCase.checkAttendance(memberId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
