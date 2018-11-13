package XO;
import XO.GameBoard;
public class Game {
    public static void main(String[] args) {

        GameBoard board = new GameBoard(3);
        Player playerOne = new Player("Adam", 'X');
        Player playerTwo = new Player("Paweł", 'O');

        System.out.println(playerOne.getName());
        System.out.println(playerOne.getSymbol());
        board.printBoard();
        board.makeMove(1,1,playerOne.getSymbol());

        board.printBoard();
        board.makeMove(1,1,playerOne.getSymbol());
        board.printBoard();
    }
}
