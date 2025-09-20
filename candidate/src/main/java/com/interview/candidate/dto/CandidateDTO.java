package com.interview.candidate.dto;

import com.interview.candidate.entity.Auditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class CandidateDTO extends AuditableDTO {

    private Long id;
    private String name;
    private String email;
    private String mobileNo;
    private String skills;
    private int totalExperience;
    private String currentLocation;
    private String appliedFor;
    private String currentDesignation;
    private String resume;
    private String currentCtc;
    private String expectedCtc;
    private String noticePeriod;
    private String source;
    private String status;
}
