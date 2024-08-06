package com.pioneers.service;

import com.pioneers.dto.MbtiDto;
import com.pioneers.entity.MbtiResult;
import org.springframework.stereotype.Service;

@Service
public class MbtiService {
    public String calcResult(MbtiDto mbtiDto){
        if(mbtiDto.getE() > mbtiDto.getI()) {
            mbtiDto.setT1("E");
        } else{
            mbtiDto.setT1("I");
        }
        if(mbtiDto.getN() > mbtiDto.getS()) {
            mbtiDto.setT2("N");
        } else{
            mbtiDto.setT2("S");
        }
        if(mbtiDto.getT() > mbtiDto.getF()) {
            mbtiDto.setT3("T");
        } else{
            mbtiDto.setT3("F");
        }
        if(mbtiDto.getP() > mbtiDto.getJ()) {
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
