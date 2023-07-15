package com.kunal.schedule.backend.repository;

import com.kunal.schedule.backend.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {
}
