package com.kunal.schedule.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @ManyToOne(optional = false)
    private Team homeTeam;  // a match has only one away team

    @ManyToOne(optional = false)
    private Team awayTeam;  // a match has only one away team

    @ManyToOne(optional = false)
    private Venue venue;    // a match can be played at only one venue

    private int ticketsSold;
}
