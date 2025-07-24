package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// todo: 도메인 객체는 POJO -> Plain Old Java Object
// todo: 그 어떤 외부 라이브러리의 의존성을 가지지 않아야 한다.
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    private Long id;
    private boolean deleteYn = false;

    // factory method
    public static Member of(Long id) {
        return new Member(id, false);
    }

    // 도메인 메서드 : 자신의 상태를 메서드를 통해 스스로 바꾼다.
    public void delete() {
        this.deleteYn = true;
    }

}
