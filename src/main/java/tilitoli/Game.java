package tilitoli;

import java.util.Scanner;

public class Game extends Engine {
    public static void main(String[] args) {
        Engine game = new Engine();

        String[][] randomField = {{"4", "2", "7"},{" ", "1", "3"},{"5", "8", "6"}};
        game.setGameField(randomField);
        game.welcomeMessage();
        game.instructionMessage();
        Scanner sc = new Scanner(System.in);
        game.actualGameField(game.getGameField());

        while(!game.isGameWon()){
            String move = sc.nextLine();
            game.setGameField(game.playerMove(game.getGameField() , move));
            game.actualGameField(game.getGameField());
            game.winningConditionIsTrue(game.getGameField());
        }
        game.gameIsWonMessage();
    }
}
