package com.interview.panel.entity;

import com.interview.panel.dto.AuditDTO;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PanelEntity extends AuditEntity {

    private String name;
    private String email;
    private int totalExperience;
    private int candidateExperienceUpto;
    private String skills;
    private String currentLocation;
    private String level;
}
