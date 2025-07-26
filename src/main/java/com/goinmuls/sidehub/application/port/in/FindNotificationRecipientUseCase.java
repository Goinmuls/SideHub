package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationRecipientResponseDto;

import java.util.List;

public interface FindNotificationRecipientUseCase {
    List<FindNotificationRecipientResponseDto> getRecipientsOfNotification(Long notificationId);
}
