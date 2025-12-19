package com.lowleveldesign;

import com.lowleveldesign.entites.Board;
import com.lowleveldesign.entites.Cell;
import com.lowleveldesign.entites.Dice;
import com.lowleveldesign.entites.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice diceCount;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    void initializeGame() {
        // Initialize board
        board = new Board(10,5,5);

        // Initialize dice
        diceCount = new Dice(1);

        // Initialize players
        addPlayers();
    }

    void addPlayers(){
        players.add(new Player("Teja",0));
        players.add(new Player("Lucky",0));
    }

    public void startGame(){
        while(winner == null) {
            // Get the current player from DeQueue
            Player currentPlayer = getCurrentPlayer();
            System.out.println("Current Player: " + currentPlayer.getName());
            // Get dice roll for the player
            int diceRoll = diceCount.rollDice();
            System.out.println("Dice Roll: " + diceRoll);
            // Move the player
            int playerNewPosition = currentPlayer.getPlayerPosition()+diceRoll;
            playerNewPosition = jumpCheck(playerNewPosition);
            currentPlayer.setPlayerPosition(playerNewPosition);
            System.out.println(currentPlayer.getName() + " rolled a " + diceRoll + " and moved to position " + playerNewPosition);
            // Check for win condition
            if(playerNewPosition >= board.cells.length * board.cells.length) {
                winner = currentPlayer;
            }
            // If winner found, set the winner
        }
        System.out.println("Winner is: " + winner.getName());
    }

    Player getCurrentPlayer(){
        Player currentPlayer = players.pollFirst();
        players.offerLast(currentPlayer);
        return currentPlayer;
    }

    int jumpCheck(int playerPosition){
        // Check if any snake or ladder present at the position
        if(playerPosition > board.cells.length*board.cells.length-1) {
            return playerPosition;
        }

        Cell cell = board.findCell(playerPosition);
        if(cell.jump != null && cell.jump.startPoint == playerPosition){
            String jumpBy = cell.jump.startPoint > cell.jump.endPoint ? "Snake" : "Ladder";
            System.out.println("Jumped by " + jumpBy);
            return cell.jump.endPoint;
        }
        // If present, return the new position after jump
        return playerPosition;
    }

}
