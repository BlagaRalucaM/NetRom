package com.example.championship.controllers;

import com.example.championship.models.Player;
import com.example.championship.models.Team;
import com.example.championship.services.PlayerService;
import com.example.championship.services.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {

    @Autowired
    private final PlayerService playerService;

    @GetMapping("/allPlayers")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player findPlayerById(@PathVariable Long id) {

        return playerService.findPlayerById(id);
    }

    @PostMapping("/savePlayer")
    public Player savePlayer(@RequestBody Player newPlayer){

        return playerService.savePlayer(newPlayer);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public void deletePlayerById(@PathVariable Long id) {
        playerService.deletePlayerById(id);
    }

    @PutMapping("/update/{id}")
    public Player replacePlayer(@PathVariable Long id,@RequestBody Player newPlayer) throws Exception {
        return playerService.replacePlayer(id,newPlayer);
    }

    @GetMapping("/byName")
    public List<Player> sortPlayersByName() {
        return playerService.sortPlayersByName();
    }

    @GetMapping("/byId")
    public List<Player> sortPlayerById(){
        return playerService.sortPlayerById();
    }
}

