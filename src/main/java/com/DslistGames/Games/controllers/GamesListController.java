package com.DslistGames.Games.controllers;

import com.DslistGames.Games.dto.GamesListDTO;
import com.DslistGames.Games.dto.GamesMinDTO;
import com.DslistGames.Games.service.GamesListService;
import com.DslistGames.Games.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {

    @Autowired
    private GamesListService gamesListService;

    @GetMapping
    public List<GamesListDTO> findAll() {
        List<GamesListDTO> result = gamesListService.findAll();
        return result;
    }


}
