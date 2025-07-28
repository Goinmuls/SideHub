package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum FileMimeType {
    JPG("JPG", "이미지 jpg 타입"),
    PNG("PNG", "이미지 png 타입");

    private String code;
    private String description;
}