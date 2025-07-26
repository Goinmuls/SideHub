package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetFileMetaResponseDto;

public interface GetFileMetaUseCase {
    GetFileMetaResponseDto getFileMeta(Long id);
}
