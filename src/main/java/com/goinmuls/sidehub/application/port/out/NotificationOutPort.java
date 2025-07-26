package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Notification;

public interface NotificationOutPort {
    Notification findById(Long id);
}
