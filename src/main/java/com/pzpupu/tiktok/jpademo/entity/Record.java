package com.pzpupu.tiktok.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CaseReviewHold {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "seg_case_review_id")
    private CaseReviewInfo caseReviewInfo;

}
