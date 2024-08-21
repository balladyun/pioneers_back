package com.pioneers.service;

import com.pioneers.domain.mbti.Mbti;
import com.pioneers.domain.mbti.MbtiRepository;
import com.pioneers.domain.mbti.MbtiType;
import com.pioneers.web.mbti.dto.request.MbtiResponse;
import com.pioneers.web.mbti.dto.response.MbtiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MbtiService {

    private final MbtiRepository mbtiRepository;

    public String evaluateMbti(MbtiResponse mbtiDto) {

        int E, I, N, S, F, T, P, J;

        List<String> arr = new ArrayList<>();
        arr.add(mbtiDto.getQ1());
        arr.add(mbtiDto.getQ2());
        arr.add(mbtiDto.getQ3());
        arr.add(mbtiDto.getQ4());
        arr.add(mbtiDto.getQ5());
        arr.add(mbtiDto.getQ6());
        arr.add(mbtiDto.getQ7());
        arr.add(mbtiDto.getQ8());
        arr.add(mbtiDto.getQ9());
        arr.add(mbtiDto.getQ10());
        arr.add(mbtiDto.getQ11());
        arr.add(mbtiDto.getQ12());

        E = Collections.frequency(arr, "E");
        I = Collections.frequency(arr, "I");
        S = Collections.frequency(arr, "S");
        N = Collections.frequency(arr, "N");
        F = Collections.frequency(arr, "F");
        T = Collections.frequency(arr, "T");
        P = Collections.frequency(arr, "P");
        J = Collections.frequency(arr, "J");

        String result = "";

        if (E > I) {
            result += "E";
        } else {
            result += "I";
        }

        if (N > S) {
            result += "N";
        } else {
            result += "S";
        }

        if (T > F) {
            result += "T";
        } else {
            result += "F";
        }

        if (P > J) {
            result += "P";
        } else {
            result += "J";
        }
        return result;
    }

    public MbtiResult findMbtiInfo(String result) {
        Mbti mbti = mbtiRepository.findByTitle(result);
        return new MbtiResult(mbti.getName(), mbti.getImageUrl(), mbti.getDescription(),
                mbti.getAdvantages(), mbti.getDisadvantages(),mbti.getDisadvantages(),
                mbti.getTeamworkUrl(), mbti.getSimilarTypeEntrepreneurs(),mbti.getEntrepreneurDescription());
//        return MbtiType.findMbtiInfo(result);
    }
}
