package com.example.championship.controllers;

import com.example.championship.models.Team;
import com.example.championship.services.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/allTeams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
    @GetMapping("/findTeam/{id}")
    public Team findTeamById(@PathVariable Long id) {

        return teamService.findTeamById(id);
    }

    @PostMapping("/saveTeam")
    public Team saveTeam(@RequestBody Team newTeam){

        return teamService.saveTeam(newTeam);
    }

    @DeleteMapping("/deleteTeam/{id}")
    public void deleteTeamById(@PathVariable Long id) {
        teamService.deleteTeamById(id);
    }

    @PutMapping("/update/{id}")
    public Team replaceTeam(@PathVariable Long id, @RequestBody Team newTeam) throws Exception {
        return teamService.replaceTeam(id,newTeam);
    }
    @GetMapping("/byName")
    public List<Team> sortTeamByName(){
        return teamService.sortTeamByName();
    }

    @GetMapping("/byId")
    public List<Team> sortTeamById(){
        return teamService.sortTeamById();
    }
}
