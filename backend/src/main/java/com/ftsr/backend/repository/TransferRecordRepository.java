package com.ftsr.backend.repository;

import com.ftsr.backend.model.TransferRecord;
import com.ftsr.backend.model.TransferStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransferRecordRepository extends JpaRepository<TransferRecord, Long> {
    List<TransferRecord> findByStatus(TransferStatus status);
    List<TransferRecord> findByUploader(String uploader);
}
