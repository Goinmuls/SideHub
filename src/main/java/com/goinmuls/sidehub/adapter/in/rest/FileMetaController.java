package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindFileMetaResponseDto;
import com.goinmuls.sidehub.application.port.in.FindFileMetaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/file-meta")
public class FileMetaController {
    private final FindFileMetaUseCase findFileMetaUseCase;

    /**
     * 파일 메타 조회
     * @param id 아이디
     * @return 파일 메타
     */
    @GetMapping("/{id}")
    public FindFileMetaResponseDto getFileMeta(@PathVariable Long id) {
        return findFileMetaUseCase.getFileMeta(id);
    }
}
