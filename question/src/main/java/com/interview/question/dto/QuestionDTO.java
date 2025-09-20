package com.interview.question.dto;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class QuestionDTO {

    private String question;
    private String answer;
    private String keywords;
    private String category;
    private String difficultyLevel;
    private String type; //practical/theoretical
}
