package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import com.goinmuls.sidehub.domain.enums.NotificationStatus;
import com.goinmuls.sidehub.domain.enums.NotificationType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GetNotificationResponseDto {
    private Long notificationId;
    private Long senderId;
    private String content;
    private NotificationStatus notificationStatus;
    private NotificationType notificationType;
    private LocalDateTime createdAt;

    public static GetNotificationResponseDto of(
            Long notificationId, Long senderId, String content,
            NotificationStatus notificationStatus, NotificationType notificationType, LocalDateTime createdAt
    ) {
        return new GetNotificationResponseDto(notificationId, senderId, content, notificationStatus, notificationType, createdAt);
    }
}
