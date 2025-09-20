package com.interview.panel.controller;

import com.interview.panel.dto.PanelDTO;
import com.interview.panel.service.PanelService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/master")
public class PanelController {

    @Autowired
    private PanelService panelService;

    @GetMapping("/")
    public ResponseEntity<List<PanelDTO>> getAllPanels(){
        List<PanelDTO> panels = panelService.getAllPanels();
        return ResponseEntity.ok(panels);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PanelDTO> getPanelById(@PathVariable Long id){
        PanelDTO panelDTO = panelService.getPanelById(id);
        return ResponseEntity.ok(panelDTO);
    }

    @PostMapping("/")
    public ResponseEntity<PanelDTO> addPanel(@RequestBody PanelDTO panelDTOToAdd){
        PanelDTO panelAdded = panelService.addPanel(panelDTOToAdd);
        return ResponseEntity.ok(panelAdded);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PanelDTO> updatePanel(@PathVariable Long id, @RequestBody PanelDTO panelDTOToUpdate){
        PanelDTO panelUpdated = panelService.updatePanel(id, panelDTOToUpdate);
        return ResponseEntity.ok(panelUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePanel(@PathVariable Long id){
        panelService.deletePanel(id);
        return ResponseEntity.ok("Panel is deleted successfully");
    }

}
