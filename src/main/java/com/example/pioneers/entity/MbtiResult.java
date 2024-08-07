package com.example.pioneers.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "mbti")
public class MbtiResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String result;

    public MbtiResult() { }

    public MbtiResult(Long id, String result){
        this.id = id;
        this.result = result;
    }
}
