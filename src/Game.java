import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int size = getSize();
        char[][] gameBoard = newGameBoard(size);
        boolean isX = true;
        boolean end = false;
        showGameBoard(gameBoard);
        while (!end) {
            printPlayer(isX);
            int[] coords = getCoordinatesFromPlayer(gameBoard, size);
            gameBoard = makeMove(gameBoard, coords, isX);
            end = checkWinner(gameBoard, isX, size);
            isX = nextPlayer(isX);
        }
    }

    static char[][] newGameBoard(int size) {
        char[][] gameBoard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = '_';
            }
        }
        return gameBoard;
    }

    static int[] getCoordinatesFromPlayer(char[][] board, int size) {
        Scanner scanner = new Scanner(System.in);
        showGameBoard(board);
        System.out.println("Podaj koordynat X:");
        int yCoordinate = scanner.nextInt() - 1;

        System.out.println("Podaj koordynat Y:");
        int xCoordinate = scanner.nextInt() - 1;

        int[] coordinates = {xCoordinate, yCoordinate};
        if (isCoordValid(coordinates, size) && isCellAvailable(board, coordinates)) {
            return coordinates;
        } else {
            System.out.println("Niewłaściwe lub zajęte koordynaty. Podaj jeszcze raz.");
            return getCoordinatesFromPlayer(board, size);
        }
    }

    static void showGameBoard(char[][] board) {
        for (int i = 1; i <= board.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" X");
        for (int j = 0; j < board.length; j++) {
            System.out.print(j + 1);
            for (int i = 0; i < board.length; i++) {
                System.out.print(board[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Y");
    }

    static boolean isCellAvailable(char[][] board, int[] coord) {
        if (board[coord[0]][coord[1]] == '_') {
            return true;
        } else {
            return false;
        }
    }

    static boolean isCoordValid(int[] coord, int size) {
        boolean isValid = false;
        for (int i = 0; i < coord.length; i++) {
            if (0 <= coord[i] && coord[i] <= size - 1) {
                isValid = true;
            } else {
                isValid = false;
            }
        }
        return isValid;
    }

    static char[][] makeMove(char[][] board, int[] coord, boolean isPlayerX) {
        if (isPlayerX) {
            board[coord[0]][coord[1]] = 'X';
        } else {
            board[coord[0]][coord[1]] = '0';
        }
        return board;
    }

    static boolean nextPlayer(boolean isPlayerX) {
        if (isPlayerX) {
            return false;
        } else {
            return true;
        }
    }

    static boolean checkWinner(char[][] board, boolean isPlayerX, int size) {
        boolean win = false;
        for (int i = 0; i < size; i++) {
            if (checkRows(board, i, size)) {
                win = true;
                printWinner(isPlayerX);
            } else if (checkColumns(board, i)) {
                win = true;
                printWinner(isPlayerX);
            } else if (checkDiagonals(board)) {
                win = true;
                printWinner(isPlayerX);
            }
        }
        return win;
    }

    static boolean checkColumns(char[][] board, int iter) {
        if (board[iter][0] == board[iter][1] && board[iter][1] == board[iter][2] && board[iter][2] != '_') {
            return true;
        } else {
            return false;
        }
    }


    static boolean checkRows(char[][] board, int iter, int size) {
        char first = board[0][iter];
        for (int i = 1; i < size; i++) {
            if ((board[i][iter] != first) ) {
                return false;
            }
        return  true;
        }

       return true;
//            if (board[0][iter] == board[1][iter] && board[1][iter] == board[2][iter] && board[2][iter] != '_') {
//            return true;
//            } else {
//                return false;
//            }
    }

    static boolean checkDiagonals(char[][] board) {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != '_') {
            return true;
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != '_') {
            return true;
        } else {
            return false;
        }
    }

    static void printWinner(boolean isPlayerX) {
        System.out.println("Wygrywa " + (isPlayerX ? 'X' : 'O'));
    }

    static void printPlayer(boolean isPlayerX) {
        System.out.println("Gracz " + (isPlayerX ? 'X' : 'O'));
    }

    static int getSize() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        return size;
    }
}
