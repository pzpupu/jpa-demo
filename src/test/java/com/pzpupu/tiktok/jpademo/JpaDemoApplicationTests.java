package com.pzpupu.tiktok.jpademo;

import com.pzpupu.tiktok.jpademo.entity.Reason;
import com.pzpupu.tiktok.jpademo.entity.Record;
import com.pzpupu.tiktok.jpademo.repository.ReasonRepository;
import com.pzpupu.tiktok.jpademo.repository.RecordRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class JpaDemoApplicationTests {

    @Autowired
    ReasonRepository reasonRepository;

    @Autowired
    RecordRepository recordRepository;

    @Test
    @Transactional
    void contextLoads() {
        Reason miss = reasonRepository.findByReason("Miss");
        System.out.println(miss.getReason());
        Record record = miss.getRecord();
        System.out.println(record.getId());
    }

    @Test
    @Rollback(value = false)
    void init() {
        Record record1 = new Record();
        record1.setName("Hello");
        recordRepository.save(record1);
        Record record2 = new Record();
        record2.setName("Mary");
        recordRepository.save(record2);

        Reason reason1 = new Reason();
        reason1.setReason("Miss");
        reason1.setRecord(record1);
        reasonRepository.save(reason1);
        Reason reason2 = new Reason();
        reason2.setReason("Cancel");
        reason2.setRecord(record1);
        reasonRepository.save(reason2);
    }

}
