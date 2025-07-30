package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum MemberProfileType {
    PROFILE("PROFILE", "프로필 이미지"),
    BACKGROUND("BACKGROUND", "배경 이미지");

    private String code;
    private String description;
}
