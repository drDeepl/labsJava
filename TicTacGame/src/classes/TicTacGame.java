package classes;
import java.util.HashMap;
public class TicTacGame extends AbstractGame{
    private int sizeGameBoard;

    int sumDiagonal(){}
    @Override
    protected Boolean checkWin(){
        int summCells = 0;
        // TODO: проверка суммы строк в матрице

        if(summCells == sizeGameBoard){
            return true;
        }
        return false;
    }
}
