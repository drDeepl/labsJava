import java.util.Scanner;
import classes.TicTacGame;
import classes.User;
import classes.RandomIntRange;
import java.util.InputMismatchException;
public class Game {
    protected int sizeBoard;

    public Game(int sizeBoard){
        this.sizeBoard = sizeBoard;

    }
    public void start(){
        User userX = new User("user_true", true);
        User userO = new User("user_false", false);
        TicTacGame ttgame = new TicTacGame(sizeBoard);
        RandomIntRange random = new RandomIntRange(0,1);
        ttgame.printBoard();
        User[] users = {userX, userO};

        boolean isWin = false;
        int lastStepUser = random.getRandomInt();
        String usernameWins = "Nobody";
        int steps = 0;

        while (!isWin){
            Scanner idCell = new Scanner(System.in);
            User currentUser = users[lastStepUser];
            System.out.println("Player " + currentUser.getUsername() + " walks" + "\nEnter the cell number.\nExample 12, where 1 - number of row\t2- number of column");
            int valueUser = 0;
            int row = valueUser/10;
            int column = valueUser % 10;
            int sizeBoard = ttgame.getSizeBoard();
            boolean userStepValue = currentUser.getStepValue();
            try{
                valueUser = idCell.nextInt();

            }catch (InputMismatchException e){
                valueUser = sizeBoard;              

            }
            finally{ 
            
            if(row < sizeBoard && column < sizeBoard ){
                
            if(ttgame.cellIsEmpty(row, column)){
                System.out.println("Cell isn't empty!");

            }
            else{
                ttgame.setValue(row, column, userStepValue);
                isWin = ttgame.checkWin(row, column, userStepValue);
                System.out.println();
                ttgame.printBoard();
                System.out.println();
                steps++;
                if(isWin){
                    usernameWins = currentUser.getUsername();

                }
                if(steps ==ttgame.getSize()){
                    System.out.println("Board is occupied");
                    break;
                }
                lastStepUser = lastStepUser == 0 ? 1 : 0;

            }

            
        }
        else{
            System.out.println("Cell is not exists!");
        }
        
        }
    }
    System.out.println(usernameWins + " is win!");
            
   

    }
}
