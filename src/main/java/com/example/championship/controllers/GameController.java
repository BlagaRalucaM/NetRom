//package com.example.championship.controllers;
//
//import com.example.championship.models.Game;
//import com.example.championship.models.Player;
//import com.example.championship.services.GameService;
//import com.example.championship.services.PlayerService;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//@AllArgsConstructor
//public class GameController {
//
//    private final GameService gameService;
//    @GetMapping
//    public Game findGameById(@PathVariable Long id) {
//
//        return gameService.findGameById(id);
//    }
//
//    @PostMapping()
//    public Game saveGame(@RequestBody Game newGame){
//
//        return gameService.saveGame(newGame);
//    }
//
//    @DeleteMapping
//    public void deleteGameById(@PathVariable Long id) {
//        gameService.deleteGameById(id);
//    }
//
//    @PutMapping
//    public Game replaceGame(@PathVariable Long id,@RequestBody Game newGame) {
//        Game replaceGame = gameService.findGameById(id);
//
//        replaceGame.setGameType(newGame.getGameType());
//
//        return gameService.replaceGame(replaceGame);
//    }
//}
