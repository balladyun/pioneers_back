package com.example.pioneers.service;

import com.example.pioneers.dto.MbtiDto;
import com.example.pioneers.dto.MbtiResponse;
import com.example.pioneers.entity.MbtiResult;
import com.example.pioneers.repository.MbtiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class MbtiService {
    private final MbtiRepository mbtiRepository;
    int E, I, N, S, F, T, P, J;

    public void counting(MbtiDto mbtiDto){
        List<String> arr = new ArrayList<>();
        arr.add(mbtiDto.getQ1()); arr.add(mbtiDto.getQ2()); arr.add(mbtiDto.getQ3()); arr.add(mbtiDto.getQ4());
        arr.add(mbtiDto.getQ5()); arr.add(mbtiDto.getQ6()); arr.add(mbtiDto.getQ7()); arr.add(mbtiDto.getQ8());
        arr.add(mbtiDto.getQ9()); arr.add(mbtiDto.getQ10()); arr.add(mbtiDto.getQ11()); arr.add(mbtiDto.getQ12());

        E = Collections.frequency(arr, "E");
        I = Collections.frequency(arr, "I");
        S = Collections.frequency(arr, "S");
        N = Collections.frequency(arr, "N");
        F = Collections.frequency(arr, "F");
        T = Collections.frequency(arr, "T");
        P = Collections.frequency(arr, "P");
        J = Collections.frequency(arr, "J");
    }
    public String calcResult(MbtiDto mbtiDto, MbtiResponse mbtiResponse){
        counting(mbtiDto);

        if(E > I) {
            mbtiResponse.setT1("E");
        } else{
            mbtiResponse.setT1("I");
        }
        if(N > S) {
            mbtiResponse.setT2("N");
        } else{
            mbtiResponse.setT2("S");
        }
        if(T > F) {
            mbtiResponse.setT3("T");
        } else{
            mbtiResponse.setT3("F");
        }
        if(P > J) {
            mbtiResponse.setT4("P");
        } else{
            mbtiResponse.setT4("J");
        }

        String result = mbtiResponse.getT1() + mbtiResponse.getT2() + mbtiResponse.getT3() + mbtiResponse.getT4();
        mbtiResponse.setResult(result);

        return result;
    }
}
