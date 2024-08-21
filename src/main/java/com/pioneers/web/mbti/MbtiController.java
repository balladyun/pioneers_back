package com.pioneers.web.mbti;

import com.pioneers.service.MbtiService;
import com.pioneers.web.mbti.dto.request.MbtiResponse;
import com.pioneers.web.mbti.dto.response.MbtiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mbti")
public class MbtiController {

    private final MbtiService mbtiService;

    @PostMapping(value = "/result")
    public ResponseEntity<String> evaluateMbti(@RequestBody MbtiResponse mbtiResponse){
        String result = mbtiService.evaluateMbti(mbtiResponse);
;        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/result/{result}")
    public MbtiResult getMbti(@PathVariable String result){
        return mbtiService.findMbtiInfo(result);
    }
}
