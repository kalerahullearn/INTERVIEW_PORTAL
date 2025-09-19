package com.interview.panel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/master")
public class PanelController {


    @GetMapping("/")
    public ResponseEntity<List> getAllPanels(){
        return ResponseEntity.ok();
    }
}
