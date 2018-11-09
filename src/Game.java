import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char[][] gameBoard = newGameBoard();
        showGameBoard(gameBoard);
        getCoordinatesFromPlayer();
        showGameBoard(gameBoard);
    }

    static char[][] newGameBoard() {
        char[][] gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = '_';
            }
        }
        return gameBoard;
    }

    static int[] getCoordinatesFromPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj koordynat X:");
        int xCoordinate = scanner.nextInt();
        System.out.println("Podaj koordynat Y:");
        int yCoordinate = scanner.nextInt();
        int[] coordinates = {xCoordinate, yCoordinate};
        return coordinates;
    }
    static void showGameBoard(char[][] board){
        System.out.println(board[0]);
        System.out.println(board[1]);
        System.out.println(board[2]);
    }
    static boolean isCellAvailable(char[][] board, int[] coord){
        if(board[coord[0]][coord[1]] == '_'){
            return true;
        } else {
            return false;
        }
    }
}
