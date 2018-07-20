package tilitoli;

public class Typos {
    public void welcomeMessage(){
        System.out.println("     ___________________");
        System.out.println("    / Hey, im Tomisan   \\");
        System.out.println("   /  and welcome to my /");
        System.out.println("  | \"Tili-toli\" game!  /");
        System.out.println("  | __________________/");
        System.out.println("  |/");
        System.out.println("  O/");
        System.out.println(" /|");
        System.out.println(" / \\");
        System.out.println("");
    }
    public void instructionMessage(){
        System.out.println("     _________________________________");
        System.out.println("    / Here you will have to push the  \\");
        System.out.println("   / numbers to the blank spot, till  /");
        System.out.println("  | you get them in order from 1-8!  /");
        System.out.println("  |  _______________________________/");
        System.out.println("  | /    #########");
        System.out.println("  |/     # 1 2 3 #");
        System.out.println(" \\O/     # 4 5 6 #");
        System.out.println("  |      # 7 8   #");
        System.out.println(" / \\     #########");
        System.out.println("");
    }
    public void actualGameField(String[][] field){
        System.out.println("#########");
        for (int i = 0; i < 3; i++) {
            System.out.print("# ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("#");
        }
        System.out.println("#########");
        System.out.println();
    }
    public void gameIsWonMessage(){
        System.out.println("   _________________");
        System.out.println("  / Congratulations \\");
        System.out.println("  |   you did it!   /");
        System.out.println("  |  ______________/");
        System.out.println("  | /");
        System.out.println("  |/");
        System.out.println(" \\O/");
        System.out.println("  | ");
        System.out.println(" / \\");
    }
    public void wrongInputMessage(){
        System.out.println("     ___________________");
        System.out.println("    / That's an invalid \\");
        System.out.println("   /  input! Type only  /");
        System.out.println("  | \"1,2,3,4,5,6,7,8\"! /");
        System.out.println("  | __________________/");
        System.out.println("  |/");
        System.out.println("  O");
        System.out.println(" /|\\");
        System.out.println(" / \\");
        System.out.println();
    }
    public void notNeighboorMessage(){
        System.out.println("     ___________________");
        System.out.println("    /  That's a number  \\");
        System.out.println("   / that doesn't have  /");
        System.out.println("  | an empty neighboor!/");
        System.out.println("  | __________________/");
        System.out.println("  |/");
        System.out.println(" \\O/");
        System.out.println("  |");
        System.out.println(" / \\");
    }
}
