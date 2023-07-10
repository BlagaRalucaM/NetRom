package com.example.championship.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "game")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Game {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "game_type")
    private String gameType;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team1_id", referencedColumnName = "ID")
    private Team team1;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team2_id", referencedColumnName = "ID")
    private Team team2;

    @Column(name = "score_1")
    private int score1;

    @Column(name = "score_2")
    private int score2;

//    @ManyToMany
//    @JoinTable(name = "score", joinColumns = @JoinColumn(name = "id_game", referencedColumnName = "ID"),
//    inverseJoinColumns = @JoinColumn(name = "id_team", referencedColumnName = "ID"))
}
