import classes.GameBoard;
public class Main {
    public static void main(String[] args) throws Exception {
        GameBoard gameBoard = new GameBoard(3,3);
        gameBoard.printBoard();
        gameBoard.setTrue(2,2);
        gameBoard.setTrue(1,1);
        gameBoard.setTrue(0,0);
        gameBoard.printBoard();
        int summ = gameBoard.summOfValueDiagonal(true);
        System.out.println("Summ of diagonal: " + summ);
        // TODO: Исправить Boolean into boolean




    }
}
