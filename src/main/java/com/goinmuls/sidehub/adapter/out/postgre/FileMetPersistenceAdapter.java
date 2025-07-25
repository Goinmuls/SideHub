package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.FileMetaEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.FileMetaJpaRepository;
import com.goinmuls.sidehub.application.port.out.FileMetaOutPort;
import com.goinmuls.sidehub.domain.FileMeta;
import com.goinmuls.sidehub.domain.factory.FileMetaFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileMetPersistenceAdapter implements FileMetaOutPort {
    private final FileMetaJpaRepository fileMetaJpaRepository;
    private final FileMetaFactory fileMetaFactory;

    /**
     * 파일 메타 조회
     * @param id 아이디
     * @return 파일 메타
     */
    @Override
    public FileMeta findById(Long id) {
        FileMetaEntity fileMetaEntity = fileMetaJpaRepository.findById(id).orElse(null);
        return fileMetaFactory.fromEntity(fileMetaEntity);
    }
}
