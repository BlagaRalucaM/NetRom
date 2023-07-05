package com.example.championship.services;

import com.example.championship.models.Player;
import com.example.championship.models.Score;
import com.example.championship.repositories.PlayerRepository;
import com.example.championship.repositories.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    public List<Score> findAll(){
        return scoreRepository.findAll();
    }

    public Score findScoreById(Long id) {
        Score test = scoreRepository.findScoreById(id);
        return scoreRepository.findScoreById(id);
    }

    public Score saveScore(Score newScore){
        return scoreRepository.save(newScore);
    }

    public void deleteScoreById(Long id){
        scoreRepository.deleteById(id);
    }

    public Score replaceScore(Score newScore){
        return scoreRepository.save(newScore);
    }
}
