package classes;

public class TicTacGame extends GameBoard {
    
    public TicTacGame(int rows, int columns){
super(rows, columns);
    }

    public boolean checkWin(int row, int column, boolean value){
        boolean result = false;
        if(summOfValuesRow(row, value) == 3 ||  summOfValuesColumn(column, value) == 3 || summOfValueDiagonal(value) == 3 || summOfSideDiagonal(value) == 3){
            result = true;
            }
        return result;
    }
    public void takeStep(int row, int column, boolean value){
        setValue(row, column, value);
    }


}
