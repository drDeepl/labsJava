package classes;

public class TicTacGame extends GameBoard {
    
    public TicTacGame(int dimension){
    super(dimension);
    }

    public boolean checkWin(int row, int column, boolean value){
        boolean result = false;
        int sizeBoard = getDim();
        if(summOfValuesRow(row, value) == sizeBoard ||  summOfValuesColumn(column, value) == sizeBoard || summOfValueDiagonal(value) == sizeBoard || summOfSideDiagonal(value) == sizeBoard){
            result = true;
            }
        return result;
    }
    public void takeStep(int row, int column, boolean value){
        setValue(row, column, value);
    }

    public int getSizeBoard(){
        return getDim();
    }


}
