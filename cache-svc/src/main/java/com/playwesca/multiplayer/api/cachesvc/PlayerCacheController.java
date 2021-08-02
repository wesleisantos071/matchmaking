package com.playwesca.multiplayer.api.cachesvc;

import jdk.jfr.internal.Logger;
import model.PlayerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("player-cache")
public class PlayerCacheController {

    @Autowired
    PlayerDataService playerDataService;


    @RequestMapping("/list")
    @GetMapping
    List<PlayerData> list(){
        long now = System.currentTimeMillis();
        List<PlayerData> playerDataList = playerDataService.listAllPlayers();
        long timeSpent = System.currentTimeMillis() - now;
        System.out.println("call time:" + timeSpent);
        return playerDataList;
    }
}
