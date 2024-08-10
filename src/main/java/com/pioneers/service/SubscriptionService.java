package com.pioneers.service;

import com.pioneers.domain.subscription.Subscription;
import com.pioneers.domain.subscription.SubscriptionRepository;
import com.pioneers.web.subscription.dto.SubscriptionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public void subscribe(SubscriptionDto subscriptionDto) {

        Subscription subscription = new Subscription(subscriptionDto.getName(), subscriptionDto.getEmail());
        subscriptionRepository.save(subscription);
    }
}
