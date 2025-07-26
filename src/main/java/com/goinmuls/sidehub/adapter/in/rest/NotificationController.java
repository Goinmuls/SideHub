package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetNotificationResponseDto;
import com.goinmuls.sidehub.application.port.in.GetNotificationUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notification")
public class NotificationController {
    private final GetNotificationUseCase getNotificationUseCase;

    /**
     * 알림 조회
     * @param id 아이디
     * @return 알림
     */
    @GetMapping("/{id}")
    public GetNotificationResponseDto getNotification(@PathVariable Long id) {
        return getNotificationUseCase.getNotification(id);
    }
}
