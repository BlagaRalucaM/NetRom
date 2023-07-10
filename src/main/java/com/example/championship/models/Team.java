package com.example.championship.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team")
@Data
public class Team {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "team_type")
    private String type;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Player> players = new ArrayList<>();

    @OneToMany(mappedBy = "team1", fetch = FetchType.EAGER)
    private List<Game> team1Games;


    @OneToMany(mappedBy = "team2", fetch = FetchType.EAGER)
    private List<Game> team2Games;
}
