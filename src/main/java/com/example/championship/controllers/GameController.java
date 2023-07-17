package com.example.championship.controllers;

import com.example.championship.models.Game;
import com.example.championship.models.Player;
import com.example.championship.services.GameService;
import com.example.championship.services.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
@AllArgsConstructor
public class GameController {

    @Autowired
    private final GameService gameService;

    @GetMapping("/allGames")
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game findGameById(@PathVariable Long id) {

        return gameService.findGameById(id);
    }

    @PostMapping("/saveGame")
    public Game saveGame(@RequestBody Game newGame){

        return gameService.saveGame(newGame);
    }

    @DeleteMapping("/deleteGame/{id}")
    public void deleteGameById(@PathVariable Long id) {
        gameService.deleteGameById(id);
    }

    @PutMapping("/update/{id}")
    public Game replaceGame(@PathVariable Long id,@RequestBody Game newGame) {
        Game replaceGame = gameService.findGameById(id);

        replaceGame.setGameType(newGame.getGameType());

        return gameService.replaceGame(replaceGame);
    }
}
