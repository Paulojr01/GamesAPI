package com.DslistGames.Games.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "tb_game_list")
public class GamesList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GamesList(){

    }

    public GamesList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GamesList gamesList)) return false;
        return getId().equals(gamesList.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
