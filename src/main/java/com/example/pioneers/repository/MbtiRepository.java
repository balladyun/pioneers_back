package com.example.pioneers.repository;

import com.example.pioneers.entity.MbtiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MbtiRepository extends JpaRepository<MbtiResult, Long> {

}
