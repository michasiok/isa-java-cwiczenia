package XO;

public class GameBoard {
    private char[][] board;
    private int size;

    public GameBoard(int size) {
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.board[i][j] = '_';
            }
        }
    }

    public void printBoard() {
        for (int i = 1; i <= size; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" X");
        for (int j = 0; j < size; j++) {
            System.out.print(j + 1);
            for (int i = 0; i < size; i++) {
                System.out.print(board[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Y");
    }

    private void setX(int xCoord, int yCoord) {
            this.board[yCoord - 1][xCoord - 1] = 'X';
    }

    private void setO(int xCoord, int yCoord) {
        this.board[yCoord - 1][xCoord - 1] = 'O';
    }

    private boolean isCellAvailable(int xCoord, int yCoord) {
        if (board[yCoord-1][xCoord - 1] == '_') {
            return true;
        } else {
            return false;
        }
    }
    private boolean isCoordValid(int xCoord, int yCoord) {
            if (0 < xCoord && xCoord <= size) {
                return true;
            } else {
                return false;
            }
    }
    public boolean makeMove(int xCoord, int yCoord, char symbol){
        if(isCoordValid(xCoord, yCoord) && isCellAvailable(xCoord, yCoord)){
            if(symbol == 'X'){
                setX(xCoord,yCoord);
            } else {
                setO(xCoord, yCoord);
            }
            return true;
        }else{
            return false;
        }
    }
}
