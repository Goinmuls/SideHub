package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum RecruitmentStatus {
    NOTREADY("NOTREADY", "모집전"),
    INPROGRESS("INPROGRESS", "모집중"),
    COMPLETE("COMPLETE", "모집완료");

    private String code;
    private String description;
}
