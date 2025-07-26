package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NotificationRecipient {
    private Long notificationRecipientId;
    private Long notificationId;
    private Long notificationTargetId;
    private boolean isRead;
    private LocalDateTime readAt;

    public static NotificationRecipient of(
            Long notificationRecipientId, Long notificationId, Long notificationTargetId,
            boolean isRead, LocalDateTime readAt
    ) {
        return new NotificationRecipient(notificationRecipientId, notificationId, notificationTargetId, isRead, readAt);
    }
}
