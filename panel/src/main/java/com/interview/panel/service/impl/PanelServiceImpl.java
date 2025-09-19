package com.interview.panel.service.impl;

import com.interview.panel.dto.PanelDTO;
import com.interview.panel.service.PanelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelServiceImpl implements PanelService {

    @Override
    public List<PanelDTO> getAllPanels() {
        return List.of(
                new PanelDTO("1", "Rahul kale", "rahul@gmail.com", 15, 12, "Java, Spring Boot, Microservices", "Pune", "GK"),
                new PanelDTO("2", "Ankit Sharma", "ankit@gmail.com", 10, 8, "Java, Spring Boot, Microservices", "Mumbai", "GK Trainee")
        );
    }

    @Override
    public PanelDTO getPanelById(String id) {
        return new PanelDTO("1", "Rahul kale", "rahul@gmail.com", 15, 12, "Java, Spring Boot, Microservices", "Pune", "GK");
    }

    @Override
    public PanelDTO addPanel(PanelDTO panelDTOToAdd) {
        panelDTOToAdd.setId("1");
        return panelDTOToAdd;
    }

    @Override
    public PanelDTO updatePanel(String id, PanelDTO panelDTOToUpdate) {
        panelDTOToUpdate.setId(id);
        return panelDTOToUpdate;
    }

    @Override
    public void deletePanel(String id) {
        System.out.println("Panel with id " + id + " deleted");
        return;
    }
}
