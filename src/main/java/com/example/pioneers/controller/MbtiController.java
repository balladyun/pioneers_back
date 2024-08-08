package com.example.pioneers.controller;

import com.example.pioneers.dto.MbtiDto;
import com.example.pioneers.dto.MbtiResponse;
import com.example.pioneers.service.MbtiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mbti")
public class MbtiController {

    private final MbtiService mbtiService;

    @PostMapping(value = "/result")
    public String mbti_calc(@RequestBody MbtiDto mbtiDto, @RequestBody MbtiResponse mbtiResponse){
        String result = mbtiService.calcResult(mbtiDto, mbtiResponse);

        return result;
    }

}
