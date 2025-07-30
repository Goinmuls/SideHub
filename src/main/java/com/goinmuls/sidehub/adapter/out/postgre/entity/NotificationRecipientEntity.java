package com.goinmuls.sidehub.adapter.out.postgre.entity;

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
@Table(name = "notification_recipient")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NotificationRecipientEntity {
    @Id
    @Comment("알림 아이디")
    @Column(name = "notification_recipient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationRecipientId;

    @Comment("알림 아이디")
    @Column(name = "notificiation_id")
    private Long notificationId;

    @Comment("알림 대상자 아이디")
    @Column(name = "notification_target_id")
    private Long notificationTargetId;

    @Comment("알림 읽음 여부")
    @Column(name = "is_read")
    private boolean isRead;

    @Comment("알림 읽은 시각")
    private LocalDateTime readAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotificationRecipientEntity that)) return false;

        return notificationRecipientId.equals(that.notificationRecipientId);
    }

    @Override
    public int hashCode() {
        return notificationRecipientId.hashCode();
    }
}
