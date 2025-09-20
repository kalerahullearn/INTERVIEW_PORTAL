package com.interview.candidate.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

    @Column(name="created_by")
    private String createdBy;
    @CreatedDate
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @Column(name="updated_by")
    private String updatedBy;
    @LastModifiedDate
    @Column(name="updated_at")
    private LocalDateTime updatedAt;
}
