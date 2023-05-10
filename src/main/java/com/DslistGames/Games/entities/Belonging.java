package com.DslistGames.Games.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;


    public Belonging(){

    }

    public Belonging(Games games, GamesList list, Integer position) {
        id.setGames(games);
        id.setList(list);
        this.position =position;
    }
}
