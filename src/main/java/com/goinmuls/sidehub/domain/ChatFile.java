package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.FileMimeType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatFile {
    private String filePath;
    private int originalSize;
    private boolean isCompressed;
    private int compressedSize;
    private FileMimeType mimeType;
    private int size;
}
