package com.interview.panel.service;

import com.interview.panel.dto.PanelDTO;

import java.util.List;

public interface PanelService {

    List<PanelDTO> getAllPanels();

    PanelDTO getPanelById(Long id);

    PanelDTO addPanel(PanelDTO panelDTOToAdd);

    PanelDTO updatePanel(Long id, PanelDTO panelDTOToUpdate);

    void deletePanel(Long id);
}
