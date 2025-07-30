package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.application.port.in.FindMemberUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final FindMemberUseCase findMemberUseCase;

    @GetMapping("/{id}")
    public void findMember(@PathVariable Long id) {
        findMemberUseCase.findMember(id);
    }
}
