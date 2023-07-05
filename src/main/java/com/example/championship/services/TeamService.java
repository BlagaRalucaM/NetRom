package com.example.championship.services;

import com.example.championship.models.Team;
import com.example.championship.repositories.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public List<Team> findAll(){
        return teamRepository.findAll();
    }

    public Team findTeamById(Long id){
        return teamRepository.findTeamById(id);
    }
    public Team saveTeam(Team newTeam){
        return teamRepository.save(newTeam);
    }

    public void deleteTeamById(Long id){
        teamRepository.deleteById(id);
    }

    public Team replaceTeam(Team newTeam){
        return teamRepository.save(newTeam);
    }

}
