package com.interview.candidate.controller;

import com.interview.candidate.dto.CandidateDTO;
import com.interview.candidate.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/master")
public class CandidateController {

    @Autowired
    private CandidateService service;

    @GetMapping("/")
    public ResponseEntity<List<CandidateDTO>> getAllCandidates() {
        return ResponseEntity.ok(service.getAllCandidates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidateDTO> getCandidateById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCandidateById(id));
    }

    @PostMapping("/")
    public ResponseEntity<CandidateDTO> createCandidate(@RequestBody CandidateDTO candidate) {
        return ResponseEntity.ok(service.createCandidate(candidate));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CandidateDTO> updateCandidate(@PathVariable Long id, @RequestBody CandidateDTO candidate) {
        return ResponseEntity.ok(service.updateCandidate(id, candidate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidate(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
