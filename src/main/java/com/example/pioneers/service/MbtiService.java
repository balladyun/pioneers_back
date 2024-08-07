package com.example.pioneers.service;

import com.example.pioneers.dto.MbtiDto;
import com.example.pioneers.entity.MbtiResult;
import com.example.pioneers.repository.MbtiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.xml.MarshallingView;

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
        arr.add(mbtiDto.getQ13()); arr.add(mbtiDto.getQ14()); arr.add(mbtiDto.getQ15()); arr.add(mbtiDto.getQ16());

        E = Collections.frequency(arr, "E");
        I = Collections.frequency(arr, "I");
        S = Collections.frequency(arr, "S");
        N = Collections.frequency(arr, "N");
        F = Collections.frequency(arr, "F");
        T = Collections.frequency(arr, "T");
        P = Collections.frequency(arr, "P");
        J = Collections.frequency(arr, "J");
    }
    public String calcResult(MbtiDto mbtiDto){
        counting(mbtiDto);

        if(E > I) {
            mbtiDto.setT1("E");
        } else{
            mbtiDto.setT1("I");
        }
        if(N > S) {
            mbtiDto.setT2("N");
        } else{
            mbtiDto.setT2("S");
        }
        if(T > F) {
            mbtiDto.setT3("T");
        } else{
            mbtiDto.setT3("F");
        }
        if(P > J) {
            mbtiDto.setT4("P");
        } else{
            mbtiDto.setT4("J");
        }

        String result = mbtiDto.getT1() + mbtiDto.getT2() + mbtiDto.getT3() + mbtiDto.getT4();
        mbtiDto.setResult(result);

        return result;
    }

    public void save(MbtiResult mbtiResult){

        MbtiResult saved = mbtiRepository.save(mbtiResult);
    }

}
