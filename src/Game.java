//import java.util.Scanner;
//
//public class Game {
//    public static void main(String[] args) {
//        System.out.println("Podaj rozmiar planszy: ");
//        int size = getSize();
//        char[][] gameBoard = newGameBoard(size);
//        boolean isX = true;
//        boolean end = false;
//        showGameBoard(gameBoard);
//        while (!end) {
//            printPlayer(isX);
//            int[] coords = getCoordinatesFromPlayer(gameBoard, size);
//            gameBoard = makeMove(gameBoard, coords, isX);
//            end = checkWinner(gameBoard, isX, size);
//            isX = nextPlayer(isX);
//        }
//    }
//
//    static char[][] newGameBoard(int size) {
//        char[][] gameBoard = new char[size][size];
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                gameBoard[i][j] = '_';
//            }
//        }
//        return gameBoard;
//    }
//
//    static int[] getCoordinatesFromPlayer(char[][] board, int size) {
//        Scanner scanner = new Scanner(System.in);
//        showGameBoard(board);
//        System.out.println("Podaj koordynat X:");
//        int yCoordinate = scanner.nextInt() - 1;
//
//        System.out.println("Podaj koordynat Y:");
//        int xCoordinate = scanner.nextInt() - 1;
//
//        int[] coordinates = {xCoordinate, yCoordinate};
//        if (isCoordValid(coordinates, size) && isCellAvailable(board, coordinates)) {
//            return coordinates;
//        } else {
//            System.out.println("Niewłaściwe lub zajęte koordynaty. Podaj jeszcze raz.");
//            return getCoordinatesFromPlayer(board, size);
//        }
//    }
//
//    static void showGameBoard(char[][] board) {
//        for (int i = 1; i <= board.length; i++) {
//            System.out.print(" " + i);
//        }
//        System.out.println(" X");
//        for (int j = 0; j < board.length; j++) {
//            System.out.print(j + 1);
//            for (int i = 0; i < board.length; i++) {
//                System.out.print(board[j][i] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Y");
//    }
//
//    static boolean isCellAvailable(char[][] board, int[] coord) {
//        if (board[coord[0]][coord[1]] == '_') {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    static boolean isCoordValid(int[] coord, int size) {
//        boolean isValid = false;
//        for (int i = 0; i < coord.length; i++) {
//            if (0 <= coord[i] && coord[i] <= size - 1) {
//                isValid = true;
//            } else {
//                isValid = false;
//            }
//        }
//        return isValid;
//    }
//
//    static char[][] makeMove(char[][] board, int[] coord, boolean isPlayerX) {
//        if (isPlayerX) {
//            board[coord[0]][coord[1]] = 'X';
//        } else {
//            board[coord[0]][coord[1]] = '0';
//        }
//        return board;
//    }
//
//    static boolean nextPlayer(boolean isPlayerX) {
//        if (isPlayerX) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    static boolean checkWinner(char[][] board, boolean isPlayerX, int size) {
//        boolean win = false;
//        for (int i = 0; i < size; i++) {
//            if (checkRows(board, i, size)) {
//                win = true;
//                printWinner(isPlayerX);
//            } else if (checkColumns(board, i)) {
//                win = true;
//                printWinner(isPlayerX);
//            } else if (checkDiagonals(board)) {
//                win = true;
//                printWinner(isPlayerX);
//            }
//        }
//        return win;
//    }
//
//    static boolean checkColumns(char[][] board, int iter) {
//
//        boolean equals = false;
//        char first = board[iter][0];
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][iter] == first && board[i][iter] != '_') {
//                equals = true;
//            } else {
//                equals = false;
//            }
//        }
//        return equals;
//    }
//
//
//    static boolean checkRows(char[][] board, int iter, int size) {
//        boolean equals = false;
//        char first = board[0][iter];
//        for (int i = 0; i < board.length; i++) {
//            if (board[iter][i] == first && board[iter][i] != '_') {
//                equals = true;
//            } else {
//                equals = false;
//            }
//        }
//        return equals;
//    }
//
//    static boolean checkDiagonals(char[][] board) {
//        for (int x = 0; x < 2; x++) {
//            boolean equals = false;
//            char first = board[0][0];
//            if (x == 1) {
//                first = board[board.length - 1][0];
//            }
//            for (int i = 0; i < board.length; i++) {
//                if (board[i][i] == first && board[i][i] != '_') {
//                    equals = true;
//                } else {
//                    equals = false;
//                }
//            }
//            if (equals) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    static void printWinner(boolean isPlayerX) {
//        System.out.println("Wygrywa " + (isPlayerX ? 'X' : 'O'));
//    }
//
//    static void printPlayer(boolean isPlayerX) {
//        System.out.println("Gracz " + (isPlayerX ? 'X' : 'O'));
//    }
//
//    static int getSize() {
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        return size;
//    }
//}
