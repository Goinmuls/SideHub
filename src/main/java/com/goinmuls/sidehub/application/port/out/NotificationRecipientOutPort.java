package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.NotificationRecipient;

import java.util.List;

public interface NotificationRecipientOutPort {
    List<NotificationRecipient> findAllByNotificationId(Long notificationId);
}
