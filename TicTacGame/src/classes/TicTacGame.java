package classes;
import java.util.HashMap;
public class TicTacGame extends AbstractGame{
    private int dimensionGameBoard;
    @Override
    protected Boolean checkWin(){
        int summCells = 0;
        // TODO: проверка суммы строк в матрице
        if(summCells == dimensionGameBoard){
            return true;
        }
        return false;
    }
}
