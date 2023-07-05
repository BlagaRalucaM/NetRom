package com.example.championship.services;

import com.example.championship.models.Player;
import com.example.championship.repositories.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public List<Player> findAll(){
        return playerRepository.findAll();
    }

    public Player findPlayerById(Long id) {
        Player test = playerRepository.findPlayerById(id);
        return playerRepository.findPlayerById(id);
    }

    public Player savePlayer(Player newPlayer){
        return playerRepository.save(newPlayer);
    }

    public void deletePlayerById(Long id){
        playerRepository.deleteById(id);
    }

    public Player replacePlayer(Player newPlayer){
        return playerRepository.save(newPlayer);
    }
}
