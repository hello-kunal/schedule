package com.kunal.schedule.backend.repository;

import com.kunal.schedule.backend.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, String> {
}
