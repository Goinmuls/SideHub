package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindFileMetaResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.entity.FileMetaEntity;
import com.goinmuls.sidehub.domain.FileMeta;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class FileMetaFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param fileMetaEntity 엔티티
     * @return 도메인
     */
    public FileMeta fromEntity(FileMetaEntity fileMetaEntity) {
        if (ObjectUtils.isEmpty(fileMetaEntity)) {
            return null;
        }

        return FileMeta.of(
          fileMetaEntity.getFileMetaId(),
          fileMetaEntity.getMemberId(),
          fileMetaEntity.getFilePath(),
          fileMetaEntity.getOriginalSize(),
          fileMetaEntity.isCompressed(),
          fileMetaEntity.getCompressedSize(),
          fileMetaEntity.getMimeType(),
          fileMetaEntity.getSize(),
          fileMetaEntity.getCreatedAt(),
          fileMetaEntity.getDeletedAt()
        );
    }

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
