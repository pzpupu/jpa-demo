package com.pzpupu.tiktok.jpademo.repository;

import com.pzpupu.tiktok.jpademo.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseReviewHoldRepository extends JpaRepository<Record, Long> {

}
