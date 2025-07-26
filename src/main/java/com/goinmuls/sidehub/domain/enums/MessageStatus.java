package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum MessageStatus {
    PENDING("PENDING", "대기"),
    SUCCESS("SUCCESS", "성공"),
    FAIL("FAIL", "실패");

    private String code;
    private String description;
}
