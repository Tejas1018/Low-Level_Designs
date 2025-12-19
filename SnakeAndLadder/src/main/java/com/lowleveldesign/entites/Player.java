package com.lowleveldesign.entites;

public class Player {
    private String name;
    private int playerPosition;

    public Player(String name,int currentPosition) {
        this.name = name;
        this.playerPosition = currentPosition; // Initial position
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}
