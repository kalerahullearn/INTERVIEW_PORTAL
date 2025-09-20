package com.interview.question.service;

import com.interview.question.dto.QuestionDTO;

import java.util.List;

public interface QuestionService {

    QuestionDTO createQuestion(QuestionDTO question);

    QuestionDTO getQuestionById(Long id);

    List<QuestionDTO> getAllQuestions();

    QuestionDTO updateQuestion(Long id, QuestionDTO question);

    void deleteQuestion(Long id);

}
