package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GetLatestChatMessageResponseDto {
    private String id;
    private Long chatRoomId;  // 채팅방 아이디
    private Long memberId;    // 사용자 아이디
    private String message;     // 최신 메세지
    private int unreadMessageCount;    // 안 읽은 수
    private LocalDateTime createdAt;    // 생성 일시

    public static GetLatestChatMessageResponseDto of(String id, Long chatRoomId, Long memberId, String message, int unreadMessageCount, LocalDateTime createdAt) {
        return new GetLatestChatMessageResponseDto(id, chatRoomId, memberId, message, unreadMessageCount, createdAt);
    }
}
