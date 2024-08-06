package com.example.pioneers.controller;

import com.example.pioneers.dto.MbtiDto;
import com.example.pioneers.entity.MbtiResult;
import com.example.pioneers.repository.MbtiRepository;
import com.example.pioneers.service.MbtiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti")
public class MbtiController {

    private MbtiService mbtiService;
    private MbtiRepository mbtiRepository;

    @PostMapping(value = "/result")
    public String mbti_calc(@RequestBody MbtiDto mbtiDto){
        String result = mbtiService.calcResult(mbtiDto);

        MbtiResult mbtiResult = mbtiDto.toEntity();
        mbtiService.save(mbtiResult);

        return result;
    }

}
