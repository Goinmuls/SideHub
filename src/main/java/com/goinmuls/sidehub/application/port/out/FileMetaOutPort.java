package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.FileMeta;

public interface FileMetaOutPort {
    FileMeta findById(Long id);
}
