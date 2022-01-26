package io.java.ipldashboard.repostitory;

import org.springframework.data.repository.CrudRepository;

import io.java.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team , Long>{
    
    Team findByTeamName(String teamName);
}
