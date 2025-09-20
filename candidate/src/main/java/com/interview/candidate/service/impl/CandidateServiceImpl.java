package com.interview.candidate.service.impl;

import com.interview.candidate.dto.CandidateDTO;
import com.interview.candidate.entity.Candidate;
import com.interview.candidate.repository.CandidateRepository;
import com.interview.candidate.service.CandidateService;
import com.netflix.discovery.converters.Auto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CandidateDTO> getAllCandidates() {
        return modelMapper.map(candidateRepository.findAll(), new TypeToken<List<CandidateDTO>>() {}.getType());
    }

    public CandidateDTO getCandidateById(Long id) {
        return modelMapper.map(candidateRepository.findById(id), CandidateDTO.class);
    }

    public CandidateDTO createCandidate(CandidateDTO candidateToAdd) {
        Candidate candidateEntityToAdd = modelMapper.map(candidateToAdd, Candidate.class);
        return modelMapper.map(candidateRepository.save(candidateEntityToAdd), CandidateDTO.class);
    }

    public CandidateDTO updateCandidate(Long id, CandidateDTO candidateToUpdate) {
        Candidate candidateEntityToUpdate = modelMapper.map(candidateToUpdate, Candidate.class);
        candidateEntityToUpdate.setId(id);
        return modelMapper.map(candidateRepository.save(candidateEntityToUpdate), CandidateDTO.class);
    }

    public void deleteCandidate(Long id) {
        System.out.println("Deleting candidate with id: " + id);
        return;
    }
}
