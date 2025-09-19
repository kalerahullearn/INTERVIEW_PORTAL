package com.interview.panel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PanelDTO extends AuditDTO {

    private String name;
    private String email;
    private int totalExperience;
    private int candidateExperienceUpto;
    private String skills;
    private String currentLocation;
    private String level;
}
