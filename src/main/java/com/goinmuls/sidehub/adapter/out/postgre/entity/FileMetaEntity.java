package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.FileMimeType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Table(name = "file_meta")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FileMetaEntity {
    @Id
    @Comment("파일 메타 아이디")
    @Column(name = "file_meat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileMetaId;

    @Comment("멤버 아이디")
    @Column(name = "member_id")
    private Long memberId;

    @Comment("이미지 파일이 저장된 경로(S3)")
    @Column(name = "file_path")
    private String filePath;

    @Comment("원본 파일 크기")
    @Column(name = "original_size")
    private int originalSize;

    @Comment("압축 여부")
    @Column(name = "is_compressed")
    private boolean isCompressed;

    @Comment("압축된 파일 크기")
    @Column(name = "compressed_size")
    private int compressedSize;

    @Comment("파일 MIME 타입")
    @Column(name = "mime_type")
    @Enumerated(EnumType.STRING)
    private FileMimeType mimeType;

    @Comment("파일 사이즈")
    @Column(name = "size")
    private int size;

    @Comment("업로드 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("삭제 일시")
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FileMetaEntity that)) return false;
        return originalSize == that.originalSize && isCompressed == that.isCompressed && compressedSize == that.compressedSize && size == that.size && Objects.equals(fileMetaId, that.fileMetaId) && Objects.equals(memberId, that.memberId) && Objects.equals(filePath, that.filePath) && mimeType == that.mimeType && Objects.equals(createdAt, that.createdAt) && Objects.equals(deletedAt, that.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileMetaId, memberId, filePath, originalSize, isCompressed, compressedSize, mimeType, size, createdAt, deletedAt);
    }
}
