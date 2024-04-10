package com.pzpupu.tiktok.jpademo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CaseReviewInfo {

    @Id
    private Long id;

    private String reason;

    @OneToMany(mappedBy = "caseReviewInfo")
    private List<CaseReviewInfo> pendingHolds;

}
