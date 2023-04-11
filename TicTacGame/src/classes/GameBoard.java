package classes;
import java.lang.StringBuilder;
import java.util.Objects;
public  class GameBoard {
  protected int size;
  protected Boolean[] board;
  private int rows;
  private int columns;

  public GameBoard(int rows, int columns){
    this.rows = rows;
    this.columns = columns;
    size = rows*columns;
    board = new Boolean[size];
  }

  
  private int getOneIfValuesMatchElseZero(Boolean boardValue, boolean checkedValue){
    
    if(Objects.isNull(boardValue)){
      return 0;
    }
    else {
      boolean boolBoardValue = boardValue;

      return (boardValue == checkedValue) ? 1 : 0;
      
    }
      
  }
  
  public int summOfValuesRow(int row, boolean value){
    int summ = 0;
    for(int column = 0; column<columns; column++){
      Boolean boardValue = board[row*columns + column];
      summ += getOneIfValuesMatchElseZero(boardValue, value); 
    }
    return summ;
  }
  
  public int summOfValuesColumn(int column, boolean value){
    int summ = 0;
    for(int row = 0; row<rows; row++){
      Boolean boardValue = board[row*columns + column];
      summ += getOneIfValuesMatchElseZero(boardValue,value);
    }
    
    return summ;
  }
  
  public int summOfValueDiagonal(boolean value){
    int summ = 0;
    for(int row = 0; row<rows; row++){
      System.out.println(row*columns + row);
      Boolean boardValue = board[row*columns + row];
      
      int oneOrZero = getOneIfValuesMatchElseZero(boardValue, value);
      summ += oneOrZero;
    }
    return summ;
  }
  
  public int summOfSideDiagonal(boolean value){
    int summ = 0;
    for(int row = 0; row < rows; row++){
      Boolean boardValue = board[rows*columns - row-1];
      int oneOrZero = getOneIfValuesMatchElseZero(boardValue, value);
      summ += oneOrZero;
    }
    return summ;
  }
  
 public void printBoard(){
    StringBuilder boardPrinted = new StringBuilder();
    for(int row=0; row<rows; row++){
      for(int column=0; column<columns; column++){
        int idx = row*columns + column;
         
        boardPrinted.append(board[idx]);
        boardPrinted.append("\t");
      }
      boardPrinted.append("\n");
    }
   System.out.println(boardPrinted);
  }
  public void getSize(){
    System.out.println(size);
  }
  
  public void setTrue(int row, int column){
    board[row*columns + column] = true;    
  }
  
  public void setFalse(int row, int column){
    board[row*columns + column] = false;    
  }
}