package com.DslistGames.Games.service;


import com.DslistGames.Games.dto.GamesDTO;
import com.DslistGames.Games.dto.GamesListDTO;
import com.DslistGames.Games.dto.GamesMinDTO;
import com.DslistGames.Games.entities.Games;
import com.DslistGames.Games.entities.GamesList;
import com.DslistGames.Games.repository.GamesListRepository;
import com.DslistGames.Games.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesListService {

    @Autowired
    private GamesListRepository gamesListRepository;



    public List<GamesListDTO> findAll() {
        List<GamesList> result = gamesListRepository.findAll();
        return result.stream().map(GamesListDTO::new).toList();
    }


}
