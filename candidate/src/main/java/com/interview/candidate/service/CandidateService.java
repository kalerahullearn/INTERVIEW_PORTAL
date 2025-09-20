package com.interview.candidate.service;

import com.interview.candidate.dto.CandidateDTO;

import java.util.List;
import java.util.Optional;

public interface CandidateService {

    List<CandidateDTO> getAllCandidates();

    CandidateDTO getCandidateById(Long id);

    CandidateDTO createCandidate(CandidateDTO candidate);

    CandidateDTO updateCandidate(Long id, CandidateDTO candidate);
}
