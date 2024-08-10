package com.pioneers.service;

import com.pioneers.domain.letter.Question;
import com.pioneers.domain.letter.QuestionRepository;
import com.pioneers.domain.subscription.Subscription;
import com.pioneers.domain.subscription.SubscriptionRepository;
import jakarta.mail.MessagingException;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@Slf4j
@RequiredArgsConstructor
@Service
public class LetterService {

    private long QUESTION_NUMBER = 1L;

    private final JavaMailSender javaMailSender;
    private final QuestionRepository questionRepository;
    private final SubscriptionRepository subscriptionRepository;
    private final EntityManager entityManager;

    @Transactional(readOnly = true)
    public void sendLetter() throws MessagingException {
        Question question = questionRepository.getQuestion(QUESTION_NUMBER);
        try (Stream<Subscription> subscriptionStream = subscriptionRepository.streamAll()) {
            subscriptionStream.forEach(subscription -> {
                try {
                    send(question, subscription);
                    entityManager.detach(subscription);
                } catch (Exception e) {
                    entityManager.detach(subscription);
                    throw new RuntimeException(e);
                }
            });
        }
    }

    public void send(Question question, Subscription subscription) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(subscription.getEmail());
        simpleMailMessage.setSubject(subscription.getName() + "님을 위한 오늘의 fuve 레터");
        simpleMailMessage.setText(question.getContent());

        try {
            javaMailSender.send(simpleMailMessage);
        } catch (Exception e) {
            log.info("레터 전송 실패");
            log.info(e.getMessage());
        }
    }
}
