package com.pioneers.web.subscription.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SubscriptionDto {

    @NotBlank
    private String name;

    @Email
    @NotNull
    private String email;
}
