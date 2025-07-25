package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationResponseDto;

public interface FindNotificationUseCase {
    FindNotificationResponseDto findById(Long id);
}
