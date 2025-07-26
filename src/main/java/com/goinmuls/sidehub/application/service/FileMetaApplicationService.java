package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindFileMetaResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.FileMetaMapper;
import com.goinmuls.sidehub.application.port.in.FindFileMetaUseCase;
import com.goinmuls.sidehub.application.port.out.FileMetaOutPort;
import com.goinmuls.sidehub.domain.FileMeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FileMetaApplicationService implements FindFileMetaUseCase {
    private final FileMetaOutPort fileMetaOutPort;
    private final FileMetaMapper fileMetaMapper;

    /**
     * 파일 메타 조회
     * @param id 아이디
     * @return 파일 메타
     */
    @Override
    public FindFileMetaResponseDto getFileMeta(Long id) {
        FileMeta fileMeta = fileMetaOutPort.findById(id);

        if (fileMeta == null) {
            throw new NoSuchElementException("파일 메타 정보를 찾을 수 없습니다.");
        }

        return fileMetaMapper.toFindResponseDto(fileMeta);
    }
}
