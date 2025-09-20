package com.interview.question.service.impl;

import com.interview.question.dto.QuestionDTO;
import com.interview.question.entity.Question;
import com.interview.question.repository.QuestionRepository;
import com.interview.question.service.QuestionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {


    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public QuestionDTO createQuestion(QuestionDTO questionDTO) {
        Question question = modelMapper.map(questionDTO, Question.class);
        Question saved = questionRepository.save(question);
        return modelMapper.map(saved, QuestionDTO.class);
    }

    @Override
    public QuestionDTO getQuestionById(Long id) {
        Question question = questionRepository.findById(id).orElse(new Question());
        return modelMapper.map(question, QuestionDTO.class);
    }

    @Override
    public List<QuestionDTO> getAllQuestions() {
        List<Question> questions = questionRepository.findAll();
        return modelMapper.map(questions, new TypeToken<List<QuestionDTO>>(){}.getType());
    }

    @Override
    public QuestionDTO updateQuestion(Long id, QuestionDTO questionDTO) {
        Question questionToUpdate = modelMapper.map(questionDTO, Question.class);
        Question updated = questionRepository.save(questionToUpdate);
        return modelMapper.map(updated, QuestionDTO.class);
    }

    @Override
    public void deleteQuestion(Long id) {
        System.out.println("Deleting question with id: " + id);
        return;
    }
}
