package com.pioneers.repository;

import com.pioneers.entity.MbtiResult;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MbtiRepository extends JpaRepository<MbtiResult, Long> {
}
