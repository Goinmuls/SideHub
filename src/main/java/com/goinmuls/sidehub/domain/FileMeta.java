package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.FileMimeType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FileMeta {
    private Long fileMetaId;
    private Long memberId;
    private String filePath;
    private int originalSize;
    private boolean isCompressed;
    private int compressedSize;
    private FileMimeType mimeType;
    private int size;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    public static FileMeta of(
            Long fileMetaId, Long memberId, String filePath, int originalSize,
            boolean isCompressed, int compressedSize, FileMimeType mimeType,
            int size, LocalDateTime createdAt, LocalDateTime deletedAt
    ) {
        return new FileMeta(fileMetaId, memberId, filePath, originalSize, isCompressed, compressedSize, mimeType, size, createdAt, deletedAt);
    }
}
