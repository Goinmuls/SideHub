package com.goinmuls.sidehub.infrastructure.util;

import java.util.List;

/**
 * 컬렉션 관련 유틸리티 클래스
 */
public class CollectionUtils {

    /**
     * 리스트 데이터 null, empty 체크
     * @param data 확인할 리스트
     * @return 리스트가 null 이거나 비어있으면 true, 그렇지 않으면 false
     */
    public static boolean isNullOrEmpty(List<?> data) {
        return data == null || data.isEmpty();
    }
}
