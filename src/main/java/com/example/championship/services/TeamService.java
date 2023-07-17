package com.example.championship.services;

import com.example.championship.models.Team;
import com.example.championship.repositories.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TeamService {

    @Autowired
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

    public Team replaceTeam(Long id,Team newTeam) throws Exception {
        if( newTeam != null) {
            Team replaceTeam = teamRepository.findTeamById(id);
            if(replaceTeam != null) {
                replaceTeam.setName(newTeam.getName());
                replaceTeam.setType(newTeam.getType());
                return teamRepository.save(replaceTeam);
            }else throw new Exception("Replaced Team not found");
        }
        throw new Exception("New Team not found");
    }

    public List<Team> sortTeamByName(){
        return teamRepository.findByOrderByNameAsc();
    }
    public List<Team> sortTeamById(){
        return teamRepository.findByOrderByIdAsc();
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }
}
