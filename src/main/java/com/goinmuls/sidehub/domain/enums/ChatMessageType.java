package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum ChatMessageType {
    TEXT("TEXT", "텍스트"),
    IMAGE("IMAGE", "이미지"),
    VIDEO("VIDEO", "비디오");

    private String code;
    private String description;
}
