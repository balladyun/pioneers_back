package com.pioneers.dto;

import com.pioneers.entity.MbtiResult;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MbtiDto {
    private int E, I, N, S,T, F, P, J;

    private String t1, t2, t3, t4;
    private String result;

    public MbtiResult toEntity(){
        return new MbtiResult(null, result);
    }
}
