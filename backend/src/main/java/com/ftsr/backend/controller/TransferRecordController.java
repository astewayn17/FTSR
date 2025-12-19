package com.ftsr.backend.controller;

import com.ftsr.backend.model.TransferRecord;
import com.ftsr.backend.repository.TransferRecordRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransferRecordController {

    private final TransferRecordRepository repo;

    public TransferRecordController(TransferRecordRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api/records")
    public List<TransferRecord> getAllRecords() {
        return repo.findAll();
    }
}
