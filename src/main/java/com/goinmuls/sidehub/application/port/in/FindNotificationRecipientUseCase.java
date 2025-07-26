package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationRecipientResponseDto;

public interface FindNotificationRecipientUseCase {
    FindNotificationRecipientResponseDto findByNotificationId(Long notificationId);
}
