//package com.example.championship.controllers;
//
//import com.example.championship.models.Player;
//import com.example.championship.models.Team;
//import com.example.championship.services.PlayerService;
//import com.example.championship.services.TeamService;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//@AllArgsConstructor
//public class PlayerController {
//
//    private final PlayerService playerService;
//    @GetMapping
//    public Player findPlayerById(@PathVariable Long id) {
//
//        return playerService.findPlayerById(id);
//    }
//
//    @PostMapping()
//    public Player savePlayer(@RequestBody Player newPlayer){
//
//        return playerService.savePlayer(newPlayer);
//    }
//
//    @DeleteMapping
//    public void deletePlayerById(@PathVariable Long id) {
//        playerService.deletePlayerById(id);
//    }
//
//    @PutMapping
//    public Player replacePlayer(@PathVariable Long id,@RequestBody Player newPlayer) {
//        Player replacePlayer = playerService.findPlayerById(id);
//
//        replacePlayer.setName(newPlayer.getName());
//        replacePlayer.setSurname(newPlayer.getSurname());
//
//        return playerService.replacePlayer(replacePlayer);
//    }
//}
