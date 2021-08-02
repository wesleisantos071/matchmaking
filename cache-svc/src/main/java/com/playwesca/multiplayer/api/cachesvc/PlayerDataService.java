package com.playwesca.multiplayer.api.cachesvc;

import model.PlayerData;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PlayerDataService {

    @Cacheable("allPlayers")
    List<PlayerData> listAllPlayers(){
        RestTemplate template = new RestTemplate();
        List<PlayerData> playerData = template.getForObject("http://localhost:54001/player/list", List.class);
        return playerData;
    }

}
