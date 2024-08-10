package com.pioneers.web.letter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LetterDto {
    private String name;
    private String email;
    private String content;
}
