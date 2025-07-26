package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum ChatRoomType {
    PRIVATE("PRIVATE", "개인"),
    GROUP("GROUP", "단체");

    private String code;
    private String description;
}
