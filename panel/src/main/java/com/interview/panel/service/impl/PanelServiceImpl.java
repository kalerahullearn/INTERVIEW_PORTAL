package com.interview.panel.service.impl;

import com.interview.panel.dto.PanelDTO;
import com.interview.panel.entity.Panel;
import com.interview.panel.repository.PanelRepository;
import com.interview.panel.service.PanelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PanelServiceImpl implements PanelService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PanelRepository panelRepository;

    @Override
    public List<PanelDTO> getAllPanels() {
        List<Panel> panels = panelRepository.findAll();
        return modelMapper.map(panels, new org.modelmapper.TypeToken<List<PanelDTO>>() {}.getType());
    }

    @Override
    public PanelDTO getPanelById(Long id) {
        Optional<Panel> panelOptional = panelRepository.findById(id);
        return panelOptional.map(panel -> modelMapper.map(panel, PanelDTO.class)).orElse(null);
    }

    @Override
    public PanelDTO addPanel(PanelDTO panelDTOToAdd) {
        Panel panelEntityToAdd =  modelMapper.map(panelDTOToAdd, Panel.class);
        panelRepository.save(panelEntityToAdd);
        return modelMapper.map(panelEntityToAdd, PanelDTO.class);
    }

    @Override
    public PanelDTO updatePanel(Long id, PanelDTO panelDTOToUpdate) {
        Panel panelEntityToUpdate =  modelMapper.map(panelDTOToUpdate, Panel.class);
        panelEntityToUpdate.setId(id);
        panelRepository.save(panelEntityToUpdate);
        return modelMapper.map(panelEntityToUpdate, PanelDTO.class);
    }

    @Override
    public void deletePanel(Long id) {
        System.out.println("Panel with id " + id + " deleted");
        return;
    }
}
