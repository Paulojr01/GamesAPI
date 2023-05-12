package com.DslistGames.Games.controllers;

import com.DslistGames.Games.dto.GamesListDTO;
import com.DslistGames.Games.dto.GamesMinDTO;
import com.DslistGames.Games.dto.ReplacementDTO;
import com.DslistGames.Games.service.GamesListService;
import com.DslistGames.Games.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {

    @Autowired
    private GamesListService gamesListService;
    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GamesListDTO> findAll() {
        List<GamesListDTO> result = gamesListService.findAll();
        return result;
    }


    @GetMapping(value = "/{listId}/games")
    public List<GamesMinDTO> findGames (@PathVariable Long listId) {
        List<GamesMinDTO> result = gamesService.findByGameList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move (@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gamesListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }
}
