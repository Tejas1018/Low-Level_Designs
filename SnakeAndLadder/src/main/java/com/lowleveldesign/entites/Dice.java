package com.lowleveldesign.entites;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int totalDiceCount;
    int min = 1;
    int max = 6;
    public Dice(int totalDiceCount) {
        this.totalDiceCount = totalDiceCount;
    }

    public int rollDice(){
        int totalSum = 0;
        int diceUsed = 0;
        while(diceUsed < totalDiceCount){
            totalSum += ThreadLocalRandom.current().nextInt(min, max + 1);
            diceUsed++;
        }
        return totalSum;
    }
}
