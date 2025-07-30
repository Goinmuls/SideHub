package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetNotificationRecipientResponseDto {
    private Long notificationRecipientId;
    private Long notificationId;
    private Long notificationTargetId;
    private boolean isRead;
    private LocalDateTime readAt;

    public static GetNotificationRecipientResponseDto of(
            Long notificationRecipientId, Long notificationId, Long notificationTargetId,
            boolean isRead, LocalDateTime readAt
    ) {
        return new GetNotificationRecipientResponseDto(notificationRecipientId, notificationId, notificationTargetId, isRead, readAt);
    }
}
