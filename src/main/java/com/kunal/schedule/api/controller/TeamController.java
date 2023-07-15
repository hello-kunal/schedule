package com.kunal.schedule.api.controller;

import com.kunal.schedule.backend.middle.TeamProvider;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/team")
@AllArgsConstructor
public class TeamController {

    private final TeamProvider teamProvider;

    @PostMapping("")
    public String addTeam(@RequestBody String teamName) {
        teamProvider.addTeam(teamName);
        return "OK";
    }
}
