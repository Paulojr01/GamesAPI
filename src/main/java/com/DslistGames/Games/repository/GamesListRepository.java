package com.DslistGames.Games.repository;

import com.DslistGames.Games.entities.Games;
import com.DslistGames.Games.entities.GamesList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesListRepository extends JpaRepository<GamesList, Long> {

}
