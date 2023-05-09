package com.DslistGames.Games.service;


import com.DslistGames.Games.dto.GamesMinDTO;
import com.DslistGames.Games.entities.Games;
import com.DslistGames.Games.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<GamesMinDTO> findAll() {
        List<Games> result = gamesRepository.findAll();
        return result.stream().map(GamesMinDTO::new).toList();
    }
}
