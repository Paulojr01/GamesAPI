package com.DslistGames.Games.dto;

import com.DslistGames.Games.entities.Games;
import com.DslistGames.Games.entities.GamesList;

public class GamesListDTO {

    private Long id;
    private String name;

    public GamesListDTO(){

    }

    public GamesListDTO(GamesList entity) {
        id= entity.getId();
        name= entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
