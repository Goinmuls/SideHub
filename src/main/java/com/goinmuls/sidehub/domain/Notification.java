package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.NotificationStatus;
import com.goinmuls.sidehub.domain.enums.NotificationType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Notification {
    private Long notificationId;
    private Long senderId;
    private String content;
    private NotificationStatus notificationStatus;
    private NotificationType notificationType;
    private LocalDateTime createdAt;

    public static Notification of(
            Long notificationId, Long senderId, String content,
            NotificationStatus notificationStatus, NotificationType notificationType, LocalDateTime createdAt
    ) {
        return new Notification(notificationId, senderId, content, notificationStatus, notificationType, createdAt);
    }
}
