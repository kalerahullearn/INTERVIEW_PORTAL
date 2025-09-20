package com.interview.panel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name = "panel")
public class Panel extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="total_experience")
    private int totalExperience;
    @Column(name="candidate_experience_upto")
    private int candidateExperienceUpto;
    @Column(name="skills")
    private String skills;
    @Column(name="current_location")
    private String currentLocation;
    @Column(name="level")
    private String level;
}
