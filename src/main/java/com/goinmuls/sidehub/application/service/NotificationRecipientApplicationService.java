package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationRecipientResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.NotificationRecipientMapper;
import com.goinmuls.sidehub.application.port.in.FindNotificationRecipientUseCase;
import com.goinmuls.sidehub.application.port.out.NotificationRecipientOutPort;
import com.goinmuls.sidehub.domain.NotificationRecipient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NotificationRecipientApplicationService implements FindNotificationRecipientUseCase {
    private final NotificationRecipientOutPort notificationRecipientOutPort;
    private final NotificationRecipientMapper notificationRecipientMapper;

    /**
     * 알림 대상자 조회
     * @param notificationId 알림 아이디
     * @return 알림 대상
     */
    @Override
    public FindNotificationRecipientResponseDto findByNotificationId(Long notificationId) {
        NotificationRecipient notificationRecipient = notificationRecipientOutPort.findByNotificationId(notificationId);

        if (notificationRecipient == null) {
            throw new NoSuchElementException("알림 대상자를 찾을 수 없습니다.");
        }

        return notificationRecipientMapper.toFindResponseDto(notificationRecipient);
    }
}
