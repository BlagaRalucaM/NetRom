//package com.example.championship.controllers;
//
//import com.example.championship.models.Team;
//import com.example.championship.services.TeamService;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//@AllArgsConstructor
//public class TeamController {
//
//    private final TeamService teamService;
//    @GetMapping
//    public Team findTeamById(@PathVariable Long id) {
//
//        return teamService.findTeamById(id);
//    }
//
//    @PostMapping()
//    public Team saveTeam(@RequestBody Team newTeam){
//
//        return teamService.saveTeam(newTeam);
//    }
//
//    @DeleteMapping
//    public void deleteTeamById(@PathVariable Long id) {
//        teamService.deleteTeamById(id);
//    }
//
//    @PutMapping
//    public Team replaceTeam(@PathVariable Long id,@RequestBody Team newTeam) {
//        Team replaceTeam = teamService.findTeamById(id);
//
//        replaceTeam.setName(newTeam.getName());
//
//        return teamService.replaceTeam(replaceTeam);
//    }
//}
