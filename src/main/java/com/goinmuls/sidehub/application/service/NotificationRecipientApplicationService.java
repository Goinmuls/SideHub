package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetNotificationRecipientResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.NotificationRecipientMapper;
import com.goinmuls.sidehub.application.port.in.GetNotificationRecipientUseCase;
import com.goinmuls.sidehub.application.port.out.NotificationRecipientOutPort;
import com.goinmuls.sidehub.domain.NotificationRecipient;
import com.goinmuls.sidehub.infrastructure.util.CollectionUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NotificationRecipientApplicationService implements GetNotificationRecipientUseCase {
    private final NotificationRecipientOutPort notificationRecipientOutPort;
    private final NotificationRecipientMapper notificationRecipientMapper;

    /**
     * 알림 대상자 조회
     * @param notificationId 알림 아이디
     * @return 알림 대상
     */
    @Override
    public List<GetNotificationRecipientResponseDto> getRecipientsOfNotification(Long notificationId) {
        List<NotificationRecipient> notificationRecipients = notificationRecipientOutPort.findAllByNotificationId(notificationId);

        if (CollectionUtils.isNullOrEmpty(notificationRecipients)) {
            throw new NoSuchElementException("알림 대상자를 찾을 수 없습니다.");
        }

        return notificationRecipients.stream()
                .map(notificationRecipientMapper::toFindResponseDto)
                .toList();
    }
}
