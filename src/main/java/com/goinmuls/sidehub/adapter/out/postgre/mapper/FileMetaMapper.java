package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindFileMetaResponseDto;
import com.goinmuls.sidehub.domain.FileMeta;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class FileMetaMapper {

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param fileMeta 도메인
     * @return 조회 응답 dto
     */
    public FindFileMetaResponseDto toFindResponseDto(FileMeta fileMeta) {
        if (ObjectUtils.isEmpty(fileMeta)) {
            return null;
        }

        return FindFileMetaResponseDto.of(
                fileMeta.getFileMetaId(),
                fileMeta.getMemberId(),
                fileMeta.getFilePath(),
                fileMeta.getOriginalSize(),
                fileMeta.isCompressed(),
                fileMeta.getCompressedSize(),
                fileMeta.getMimeType(),
                fileMeta.getSize(),
                fileMeta.getCreatedAt(),
                fileMeta.getDeletedAt()
        );
    }
}
