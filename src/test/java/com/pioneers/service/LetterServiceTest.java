package com.pioneers.service;

import com.pioneers.domain.letter.Question;
import com.pioneers.domain.letter.QuestionRepository;
import com.pioneers.domain.subscription.Subscription;
import jakarta.mail.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LetterServiceTest {

    @Autowired
    private LetterService letterService;

    @Autowired
    private QuestionRepository questionRepository;


    @Test
    void test1() throws MessagingException {

        Question question = questionRepository.getQuestion(1L);
        Subscription subscription = new Subscription("정연호", "dusgh70312@gmail.com");
        letterService.send(question,subscription);
    }
}