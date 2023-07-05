package com.example.championship.services;

import com.example.championship.models.Game;
import com.example.championship.models.Player;
import com.example.championship.repositories.GameRepository;
import com.example.championship.repositories.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GameService {

    private final GameRepository gameRepository;

    public List<Game> findAll(){
        return gameRepository.findAll();
    }

    public Game findGameById(Long id) {
        Game test = gameRepository.findGameById(id);
        return gameRepository.findGameById(id);
    }

    public Game saveGame(Game newGame){
        return gameRepository.save(newGame);
    }

    public void deleteGameById(Long id){
        gameRepository.deleteById(id);
    }

    public Game replaceGame(Game newGame){
        return gameRepository.save(newGame);
    }
}
