package com.example.championship.repositories;

import com.example.championship.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findTeamById(Long id);
    List<Team> findByOrderByNameAsc();
    List<Team> findByOrderByIdAsc();
}
