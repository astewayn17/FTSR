package com.ftsr.backend.config;

import com.ftsr.backend.model.TransferRecord;
import com.ftsr.backend.model.TransferStatus;
import com.ftsr.backend.repository.TransferRecordRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class SeedDataConfig {

    @Bean
    CommandLineRunner seed(TransferRecordRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                TransferRecord r = new TransferRecord();
                r.setFileName("example.txt");
                r.setUploader("local-dev");
                r.setStatus(TransferStatus.PENDING);
                r.setStoragePath("/data/uploads/example.txt");
                r.setCorrelationId(UUID.randomUUID().toString());
                r.setNotes("Seed record for development");

                repo.save(r);
            }
        };
    }
}
