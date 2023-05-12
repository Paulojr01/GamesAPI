package com.DslistGames.Games.service;


import com.DslistGames.Games.dto.GamesDTO;
import com.DslistGames.Games.dto.GamesListDTO;
import com.DslistGames.Games.dto.GamesMinDTO;
import com.DslistGames.Games.entities.Games;
import com.DslistGames.Games.entities.GamesList;
import com.DslistGames.Games.projections.GameMinProjection;
import com.DslistGames.Games.repository.GamesListRepository;
import com.DslistGames.Games.repository.GamesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesListService {

    @Autowired
    private GamesListRepository gamesListRepository;

    @Autowired
    private GamesRepository gamesRepository;


    @Transactional
    public List<GamesListDTO> findAll() {
        List<GamesList> result = gamesListRepository.findAll();
        return result.stream().map(GamesListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gamesRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
        for (int i= min; i <=max; i++){
            gamesListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
