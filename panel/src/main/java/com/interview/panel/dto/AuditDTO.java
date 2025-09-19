package com.interview.panel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuditDTO {

    private String createdBy;
    private String createdAt;
    private String updatedBy;
    private String updatedAt;
}
