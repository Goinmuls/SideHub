package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.NotificationMapper;
import com.goinmuls.sidehub.application.port.in.FindNotificationUseCase;
import com.goinmuls.sidehub.application.port.out.NotificationOutPort;
import com.goinmuls.sidehub.domain.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NotificationApplicationService implements FindNotificationUseCase {
    private final NotificationOutPort notificationOutPort;
    private final NotificationMapper notificationMapper;

    /**
     * 알림 조회
     * @param id 아이디
     * @return 알림
     */
    @Override
    public FindNotificationResponseDto findById(Long id) {
        Notification notification = notificationOutPort.findById(id);

        if (notification == null) {
            throw new NoSuchElementException("알림을 찾을 수 없습니다.");
        }
        return notificationMapper.toFindResponseDto(notification);
    }
}
