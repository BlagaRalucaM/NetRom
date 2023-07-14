package com.example.championship.services;

import com.example.championship.models.Player;
import com.example.championship.repositories.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerService {


    @Autowired
    private final PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player findPlayerById(Long id) {
        Player player = playerRepository.findPlayerById(id);
        return playerRepository.findPlayerById(id);
    }

    public Player savePlayer(Player newPlayer) {
        return playerRepository.save(newPlayer);
    }

    public void deletePlayerById(Long id) {
        playerRepository.deleteById(id);
    }

    public Player replacePlayer(Long id, Player newPlayer) throws Exception {
        if (newPlayer != null) {
            Player replacePlayer = playerRepository.findPlayerById(id);
            if (replacePlayer != null) {
                replacePlayer.setName(newPlayer.getName());
                replacePlayer.setSurname(newPlayer.getSurname());
                return playerRepository.save(newPlayer);
            } else throw new Exception("Player noy found");
        }
        throw new Exception("New Player not found");
    }

    public List<Player> sortPlayersByName() {
        return playerRepository.findAll(Sort.by("name"));
    }

}
