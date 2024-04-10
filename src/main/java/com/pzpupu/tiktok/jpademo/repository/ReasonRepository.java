package com.pzpupu.tiktok.jpademo.repository;

import com.pzpupu.tiktok.jpademo.entity.Reason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReasonRepository extends JpaRepository<Reason, Long> {


    // 查询Reason表中reason为指定值的记录
    Reason findByReason(String name);

}
