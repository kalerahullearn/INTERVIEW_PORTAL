package com.interview.panel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PanelDTO extends AuditableDTO {

    private String id;
    private String name;
    private String email;
    private int totalExperience;
    private int candidateExperienceUpto;
    private String skills;
    private String currentLocation;
    private String level;
    private String category;
}
