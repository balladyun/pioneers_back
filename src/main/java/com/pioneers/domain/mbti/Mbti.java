package com.pioneers.domain.mbti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Mbti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String name;
    private String imageUrl;
    private String description;
    private String advantages;
    private String disadvantages;
    private String teamwork;
    private String teamworkUrl;
    private String similarTypeEntrepreneurs;
    private String entrepreneurDescription;
}
