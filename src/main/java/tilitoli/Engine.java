package tilitoli;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Engine extends Typos {

    private boolean gameWon = false;
    private String[][] gameField = {{"1","2","3"},{"4","5","6"},{"7", "8", " "}};

    Engine() {
    }

    private boolean isValidMove(String input){

        HashSet<String> numbers = new HashSet<String>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");

        boolean result;
        if (input.length() >= 2 || !numbers.contains(input)){
            result = false;
        } else {
            int inputAsNumber = Integer.parseInt(input);
            List<Integer> validNumbers = new ArrayList<Integer>();
            for (int i = 1; i < 9; i++) {
                validNumbers.add(i);
            }
            result = validNumbers.contains(inputAsNumber);

        }

        return result;
    }

    public boolean winningConditionIsTrue(String[][] field) {
        if (field[0][0].equals("1") &&
                field[0][1].equals("2") &&
                field[0][2].equals("3") &&
                field[1][0].equals("4") &&
                field[1][1].equals("5") &&
                field[1][2].equals("6") &&
                field[2][0].equals("7") &&
                field[2][1].equals("8") &&
                field[2][2].equals(" ")){
            gameWon = true;
        }
        return gameWon;
    }

    public String[][] playerMove(String[][] field, String num){
        int firstNumX = 0;
        int firstNumY = 0;
        int secondNumX = 0;
        int secondNumY = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(num)) {
                    firstNumX = i;
                    firstNumY = j;
                }
                if (field[i][j].equals(" ")) {
                    secondNumX = i;
                    secondNumY = j;
                }
            }
        }
        if (isValidMove(num)){
            if (Math.abs((firstNumX+firstNumY) - (secondNumX+secondNumY)) == 1 &&
                    ((Math.abs(firstNumX-secondNumX) < 2 && Math.abs(firstNumY-secondNumY) < 2))){
                return swap(field, firstNumX,firstNumY,secondNumX,secondNumY);
            } else{
                notNeighboorMessage();
                return field;
            }
        } else{
            wrongInputMessage();
            return field;
        }
    }

    private String[][] swap (String[][] field, int firstNumX, int firstNumY, int secondNumX, int secondNumY){
        String tmp;
        tmp = field[firstNumX][firstNumY];
        field[firstNumX][firstNumY] = field[secondNumX][secondNumY];
        field[secondNumX][secondNumY] = tmp;

        return field;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public void setGameWon(boolean gameWon) {
        this.gameWon = gameWon;
    }

    public String[][] getGameField() {
        return gameField;
    }

    public void setGameField(String[][] gameField) {
        this.gameField = gameField;
    }
}
