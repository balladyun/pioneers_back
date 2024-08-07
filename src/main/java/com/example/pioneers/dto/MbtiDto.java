package com.example.pioneers.dto;

import com.example.pioneers.entity.MbtiResult;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MbtiDto {
    //private int E, I, N, S,T, F, P, J;
    private String Q1, Q2, Q3, Q4,Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16;

    private String t1, t2, t3, t4;
    private String result;

    public MbtiResult toEntity(){
        return new MbtiResult(null, result);
    }
}
