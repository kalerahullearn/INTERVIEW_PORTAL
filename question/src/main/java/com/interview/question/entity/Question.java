package com.interview.question.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="question")
@Getter @Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String answer;
    private String keywords;
    private String category;
    @Column(name="difficulty_level")
    private String difficultyLevel;
    private String type;
}
