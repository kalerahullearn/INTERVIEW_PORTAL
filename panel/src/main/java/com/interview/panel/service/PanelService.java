package com.interview.panel.service;

import com.interview.panel.dto.PanelDTO;

import java.util.List;

public interface PanelService {

    List<PanelDTO> getAllPanels();

    PanelDTO getPanelById(String id);

    PanelDTO addPanel(PanelDTO panelDTOToAdd);

    PanelDTO updatePanel(String id, PanelDTO panelDTOToUpdate);

    void deletePanel(String id);
}
