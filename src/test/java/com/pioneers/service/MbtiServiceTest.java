package com.pioneers.service;

import com.pioneers.web.mbti.dto.request.MbtiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MbtiServiceTest {

    @Autowired
    private MbtiService mbtiService;


    @Test
    void test1(){
        MbtiResponse mbtiResponse = new MbtiResponse("E", "E", "I", "S", "S", "N", "T", "T", "T", "J", "J", "J");
        String s = mbtiService.evaluateMbti(mbtiResponse);
    }
}