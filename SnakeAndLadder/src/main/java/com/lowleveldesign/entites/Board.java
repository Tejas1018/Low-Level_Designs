package com.lowleveldesign.entites;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private int dimensios;
    public Cell[][] cells;

    public Board(int dimensios,int totalSnakes,int totalLadders) {
        initializeBoard(dimensios);
        addSnakesAndLadders(totalSnakes,totalLadders);
    }

    public void initializeBoard(int dimensios) {
        cells = new Cell[dimensios][dimensios];
        for(int i = 0 ; i < dimensios; i++) {
            for(int j = 0; j < dimensios; j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    void addSnakesAndLadders(int totalSnakes,int totalLadders) {
        while(totalSnakes > 0) {
            // Logic to add snake
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(snakeHead < snakeTail) {
                continue;
            }
            Jump jumpObj = new Jump();
            jumpObj.startPoint = snakeHead;
            jumpObj.endPoint = snakeTail;

            Cell snakeCell = findCell(snakeHead);
            totalSnakes--;
        }
        while(totalLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(ladderStart > ladderEnd) {
                continue;
            }

            Jump jumpObj = new Jump();
            jumpObj.startPoint = ladderStart;
            jumpObj.endPoint = ladderEnd;
            Cell ladderCell = findCell(ladderStart);
            totalLadders--;
        }
    }


    public Cell findCell(int currentPosition) {
        int row = currentPosition / cells.length;
        int col = currentPosition % cells.length;
        return cells[row][col];
    }

}

