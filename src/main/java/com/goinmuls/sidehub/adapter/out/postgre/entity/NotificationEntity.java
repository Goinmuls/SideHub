package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.NotificationStatus;
import com.goinmuls.sidehub.domain.enums.NotificationType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Table(name = "notification")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NotificationEntity {
    @Id
    @Comment("알림 아이디")
    @Column(name = "notification_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @Comment("알림 전송자 아이디")
    @Column(name = "sender_id")
    private Long senderId;

    @Comment("알림 내용")
    @Column(name = "content")
    private String content;

    @Comment("알림 전송 상태")
    @Column(name = "notification_status")
    private NotificationStatus notificationStatus;

    @Comment("알림 유형")
    @Column(name = "notification_type")
    private NotificationType notificationType;

    @Comment("생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NotificationEntity that)) return false;
        return Objects.equals(notificationId, that.notificationId) && Objects.equals(senderId, that.senderId) && Objects.equals(content, that.content) && notificationStatus == that.notificationStatus && notificationType == that.notificationType && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, senderId, content, notificationStatus, notificationType, createdAt);
    }
}
