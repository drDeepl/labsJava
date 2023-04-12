import java.util.Scanner;
import classes.TicTacGame;
import classes.User;
public class Main {
    public static void main(String[] args) throws Exception {
        User userX = new User("user1", true);
        User userO = new User("user2", false);
        TicTacGame ttgame = new TicTacGame(3, 3);
        ttgame.printBoard();
        boolean isWin = false;

        while (!isWin){
            Scanner inIdx = new Scanner(System.in);
            System.out.println("Ходит первый игрок\n Введи номер ячейки.\nНапример: 12, 1 - строка, 2 - колонка");
            int valueUser = inIdx.nextInt();
            Scanner inValue = new Scanner(System.in);
            System.out.println("Введи + илл 0, где + - крестик,  - нолик");
            String input = inValue.trim();
            boolean value = (inValue.trim() == "+" )? true : false;

            
        }
        




    }
}
