package com.pioneers.web.subscription;

import com.pioneers.service.SubscriptionService;
import com.pioneers.web.subscription.dto.SubscriptionDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @PostMapping("/subscribe")
    public void subscribe(@Valid@RequestBody SubscriptionDto subscriptionDto){
        subscriptionService.subscribe(subscriptionDto);
    }

}
