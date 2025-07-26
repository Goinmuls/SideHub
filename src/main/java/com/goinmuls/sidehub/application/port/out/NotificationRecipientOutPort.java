package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.NotificationRecipient;

public interface NotificationRecipientOutPort {
    NotificationRecipient findByNotificationId(Long notificationId);
}
