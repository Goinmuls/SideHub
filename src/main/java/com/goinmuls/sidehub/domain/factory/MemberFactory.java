package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.MemberEntity;
import com.goinmuls.sidehub.domain.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberFactory {

    public Member from(MemberEntity memberEntity) {
        if (memberEntity == null) {
            return null;
        }

        return Member.of(memberEntity.getId());
    }

}
