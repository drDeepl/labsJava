import classes.TicTacGame;
public class Game {
    public static void main(String[] args) throws Exception {
        TicTacGame game = new TicTacGame(3,3);
        game.printBoardPlay();
        game.setTac(0, 0);
        game.printBoardPlay();
        game.setTac(0, 2);
        game.printBoardPlay();
        game.setTic(0, 2);
        game.setTic(0, 1);
        game.printBoardPlay();
        game.setTic(2, 1);
        game.printBoardPlay();
    }
}
