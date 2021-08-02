package com.playwesca.multiplayer.api.datasvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Player")
public class Player {
    @Id
    @Column(name = "PLAYER_NAME")
    String playerName;

    @Column(name = "PLAYER_LEVEL")
    int playerLevel;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }
}
