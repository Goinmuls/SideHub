package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationRecipientResponseDto;
import com.goinmuls.sidehub.application.port.in.FindNotificationRecipientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notification-recipient")
public class NotificationRecipientController {
    private FindNotificationRecipientUseCase findNotificationRecipientUseCase;

    /**
     * 알림 대상자 조회
     * @param notificationId 알림 아이디
     * @return 알림 대상
     */
    @GetMapping("/by-notification/{notificationId}")
    public FindNotificationRecipientResponseDto findByNotificationId(@PathVariable Long notificationId) {
        return findNotificationRecipientUseCase.findByNotificationId(notificationId);
    }
}
