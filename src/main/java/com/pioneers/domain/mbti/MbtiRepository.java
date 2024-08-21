package com.pioneers.domain.mbti;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiRepository extends JpaRepository<Mbti, Long> {

    Mbti findByTitle(String title);
}
