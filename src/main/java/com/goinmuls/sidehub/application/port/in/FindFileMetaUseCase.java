package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindFileMetaResponseDto;

public interface FindFileMetaUseCase {
    FindFileMetaResponseDto getFileMeta(Long id);
}
