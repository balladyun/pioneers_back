package com.pioneers.domain.letter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Question {

    private final long id;
    private final String content;
}
