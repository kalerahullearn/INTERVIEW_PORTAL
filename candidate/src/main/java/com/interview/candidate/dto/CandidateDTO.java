package com.interview.candidate.dto;

import com.interview.candidate.entity.Auditable;
import jakarta.persistence.*;


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
}
