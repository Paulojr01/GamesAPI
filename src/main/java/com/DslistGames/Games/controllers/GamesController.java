package com.DslistGames.Games.controllers;

import com.DslistGames.Games.dto.GamesDTO;
import com.DslistGames.Games.dto.GamesMinDTO;
import com.DslistGames.Games.entities.Games;
import com.DslistGames.Games.service.GamesService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GamesMinDTO> findAll() {
        List<GamesMinDTO> result = gamesService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GamesDTO findById(@PathVariable Long id){
        GamesDTO result = gamesService.findById(id);
        return result;
    }

}
