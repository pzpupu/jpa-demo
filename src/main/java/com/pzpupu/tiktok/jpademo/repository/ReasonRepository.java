package com.pzpupu.tiktok.jpademo.repository;

import com.pzpupu.tiktok.jpademo.entity.Reason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseReviewInfoRepository extends JpaRepository<Reason, Long> {

}
