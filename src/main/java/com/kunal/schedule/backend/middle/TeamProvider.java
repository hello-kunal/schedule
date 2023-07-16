package com.kunal.schedule.backend.middle;

import com.kunal.schedule.backend.entity.Team;
import com.kunal.schedule.backend.repository.TeamRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@AllArgsConstructor
@Service
@RequestScope
@Transactional
public class TeamProvider {

    private final TeamRepository teamRepository;

    public void addTeam(String teamName) {
        Team team = new Team();
        team.setTeamName(teamName);
        this.teamRepository.save(team);
    }
}
