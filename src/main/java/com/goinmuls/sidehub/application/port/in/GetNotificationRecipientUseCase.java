package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetNotificationRecipientResponseDto;

import java.util.List;

public interface GetNotificationRecipientUseCase {
    List<GetNotificationRecipientResponseDto> getRecipientsOfNotification(Long notificationId);
}
