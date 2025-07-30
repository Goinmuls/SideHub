package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetNotificationResponseDto;

public interface GetNotificationUseCase {
    GetNotificationResponseDto getNotification(Long id);
}
