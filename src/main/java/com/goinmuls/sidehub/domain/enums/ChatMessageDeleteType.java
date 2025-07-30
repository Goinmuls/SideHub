package com.goinmuls.sidehub.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum ChatMessageDeleteType {
    MY("MY", "나에게만 삭제"),
    ALL("ALL", "모든 대화방에서 삭제");

    private String code;
    private String description;
}
