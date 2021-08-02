package com.playwesca.multiplayer.api.datasvc;

import com.playwesca.multiplayer.api.datasvc.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/player")
public class PlayerDataController {

    @Autowired
    PlayerRepo playerRepo;

    @RequestMapping("/list")
    @GetMapping
    List<Player> list(){
        return playerRepo.findAll();
    }
}
