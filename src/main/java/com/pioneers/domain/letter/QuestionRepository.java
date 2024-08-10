package com.pioneers.domain.letter;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class QuestionRepository {

    private final Map<Long, Question> letters = generateList();


    public Question getQuestion(Long id){
        return letters.get(id);
    }

    private Map<Long, Question> generateList() {

        Map<Long, Question> map = new HashMap<>();

        long id = 1L;

        map.put(id, new Question(id++, "현재 가장 관심있는 자기개발 분야는 무엇인가요?"));
        map.put(id, new Question(id++, "시간 가는 줄 모르고 몰입할 수 있는 일이 있나요?"));
        map.put(id, new Question(id++, "내가 잘 모르는 분야이지만 배워보고 싶은 게 있다면?"));
        map.put(id, new Question(id++, "주변인들이 생각하는,혹은 자주 언급되는 당신의 재능은 무엇인가요?"));
        map.put(id, new Question(id++, "'스스로 나는 00에 타고난 것같아'라고 느끼는 것이 있나요?"));
        map.put(id, new Question(id++, "성과를 냈던 일 중에 가장 기억에 남는 일은 무엇인가요?"));
        map.put(id, new Question(id++, "창업팀에서 기여하고 싶은 분야는 무엇인가요?"));
        map.put(id, new Question(id++, "자격증이나 가지고 있는 기술이 있다면 무엇인가요?"));
        map.put(id, new Question(id++, "인생에서 가장 중요한 가치는 무엇인가요?"));
        map.put(id, new Question(id++, "당신에게 '보람차다'의 의미는 무엇인가요?"));
        map.put(id, new Question(id++, "당신에게 실패란 어떤 것을 의미하나요?"));
        map.put(id, new Question(id++, "실패를 극복한 경험이 있다면 알려주세요"));
        map.put(id, new Question(id++, "내가 잘할 수 있는 일 중, 타인을 이롭게할 수 있는 일이 있나요?"));
        map.put(id, new Question(id++, "13번 질문에서 답한 것을 창업 아이템으로 발전시켜보세요"));
        map.put(id, new Question(id++, "창업을 결심학 된 계기가 있다면 공유해주세요"));
        map.put(id, new Question(id++, "이번 창업을 통해 무엇을 얻고 싶나요?"));
        map.put(id, new Question(id++, "창업으로 성공하기 쉽지 않지면, 꼭 도전하려는 이유가 있나요?"));
        map.put(id, new Question(id++, "창업 활동에 주에 몇시간까지 투자할 수 있나요?"));
        map.put(id, new Question(id++, "창업에 대한 영감을 주는 인물을 생각해보세요"));
        map.put(id, new Question(id++, "흥미로운 창업 사례가 있다면 소개해주세요"));
        map.put(id, new Question(id++, "창업 경험이 있나요? 그 경험이 어떤 영향을 주었나요?"));
        map.put(id, new Question(id++, "창업인에게 가장 필요한 3가지 자질이 무엇이라고 생각하나요?"));
        map.put(id, new Question(id++, "창업을 할 때 동업할 팀원이 꼭 필요하다고 생각하나요?"));
        map.put(id, new Question(id++, "어떤 자질을 가진 팀원과 일하고 싶나요?"));
        map.put(id, new Question(id++, "당신은 어떤 리더를 바라나요?"));
        map.put(id, new Question(id++, "빠른 수익 창출이 가능한 창업 아이템 vs 가치가 담긴 독창적인 창업 아이템"));
        map.put(id, new Question(id++, "팀원들과 의견이 다를 때 나만의 조율 방식이 있나요?"));
        map.put(id, new Question(id++, "팀의 창업 목표 및 가치와 각 팀원 개인의 창업 목표 및 가치가 어떻게 연결되어 있나요?"));
        map.put(id, new Question(id++, "초근에 본 뉴스나 기사 중에 가장 기억에 남는 주제는 무엇인가요?"));
        map.put(id, new Question(id++, "거주지의 특징과 장단점 등을 활용하여 창업 아이템을 생각해보세요"));
        map.put(id, new Question(id++, "당신이 가장 잘 사용하고 있는 어플의 불편한 점을 생각해보세요"));
        map.put(id, new Question(id++, "앞서 보낸 1,2,3번의 답변에서 가장 공감받은 문제점에 대해 논의해보세요"));
        map.put(id, new Question(id++, "그 문제점에 가장 공감할 수 있는 타겟을 설정해보세요"));
        map.put(id, new Question(id++, "창업을 통해 해결하고자 하는 문제는 무엇인가요?"));
        map.put(id, new Question(id++, "문제 해결 방안을 자본금에 따라 고민해보세요"));
        map.put(id, new Question(id++, "창업 시 발생할 수 있는 문제는 무엇이 있을까요?"));
        map.put(id, new Question(id++, "구상한 아이템의 창업 자금은 얼마나 필요할까요?"));
        map.put(id, new Question(id++, "아이템 구현을 위한 자금은 어떻게 마련할 것인가요?"));
        map.put(id, new Question(id++, "창업 아이템의 수익창출 방안을 구상해보세요"));
        map.put(id, new Question(id++, "아이템 성공을 위한 최적의 시기는 언제인가요?"));
        map.put(id, new Question(id++, "경쟁사를 찾을 수 있는 키워드를 3개씩 떠올려보세요"));
        map.put(id, new Question(id++, "이전 질문을 활용해서 경쟁사를 찾아보세요"));
        map.put(id, new Question(id++, "경쟁사와 여러분의 아이템을 비교해보세요"));
        map.put(id, new Question(id, "당신의 창업 아이템의 소구점은 무엇인가요?"));

        return map;
    }


}
