package com.kunal.schedule.backend.repository;

import com.kunal.schedule.backend.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, String> {
}
