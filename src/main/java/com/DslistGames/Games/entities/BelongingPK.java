package com.DslistGames.Games.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games games;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GamesList list;

    public BelongingPK (){

    }

    public BelongingPK(Games games, GamesList list) {
        this.games = games;
        this.list = list;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public GamesList getList() {
        return list;
    }

    public void setList(GamesList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;
        return getGames().equals(that.getGames()) && getList().equals(that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGames(), getList());
    }
}
