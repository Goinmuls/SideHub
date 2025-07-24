package com.goinmuls.sidehub.adapter.out.postgre.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Getter
@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // id 만으로 판별하는 equals와 hashCode 메서드 구현
    // JPA 엔티티는 equals와 hashCode를 구현할 때, 식별자(id)를 기준으로 비교하는 것이 일반적이다.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MemberEntity that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
