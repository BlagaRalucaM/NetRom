//package com.example.championship.controllers;
//
//import com.example.championship.models.Game;
//import com.example.championship.models.Score;
//import com.example.championship.services.GameService;
//import com.example.championship.services.ScoreService;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping
//public class ScoreController {
//
//    private final ScoreService scoreService;
//    @GetMapping
//    public Score findScoreById(@PathVariable Long id) {
//
//        return scoreService.findScoreById(id);
//    }
//
//    @PostMapping()
//    public Score saveScore(@RequestBody Score newScore){
//
//        return scoreService.saveScore(newScore);
//    }
//
//    @DeleteMapping
//    public void deleteScoreById(@PathVariable Long id) {
//        scoreService.deleteScoreById(id);
//    }
//
//    @PutMapping
//    public Score replaceScore(@PathVariable Long id,@RequestBody Score newScore) {
//        Score replaceScore = scoreService.findScoreById(id);
//
//        replaceScore.setScore(newScore.getScore());
//
//        return scoreService.replaceScore(replaceScore);
//    }
//}
