package com.playwesca.multiplayer.api.datasvc;

import com.playwesca.multiplayer.api.datasvc.model.Player;
import model.PlayerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/player")
public class PlayerDataController {

    @Autowired
    PlayerRepo playerRepo;

    @RequestMapping("/list")
    @GetMapping
    List<PlayerData> list(){
        List<Player> players = playerRepo.findAll();
        List<PlayerData> playerDataList = new ArrayList<>();
        for (Player player: players) {
            PlayerData playerData = new PlayerData();
            playerData.setPlayerName(player.getPlayerName());
            playerData.setPlayerLevel(player.getPlayerLevel());
            playerDataList.add(playerData);
        }
        return playerDataList;
    }
}
