package com.interview.candidate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Candidate extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="email", unique = true)
    private String email;
    @Column(name="mobile", unique = true)
    private String mobileNo;
    @Column(name="skills")
    private String skills;
    @Column(name="total_experience")
    private int totalExperience;
    @Column(name="current_location")
    private String currentLocation;
    @Column(name="applied_for")
    private String appliedFor;
    @Column(name="current_designation")
    private String currentDesignation;
    @Column(name="resume")
    private String resume;
    private String currentCtc;
    private String expectedCtc;
    private String noticePeriod;
    private String source;
    private String status;
}
