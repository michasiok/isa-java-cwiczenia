package XO;

public class GameBoard {
    public Mark[][] board;
    private int size;

    public GameBoard(int size) {
        this.size = size;
        this.board = new Mark[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.board[i][j] = Mark.EMPTY;
            }
        }
    }

    private void setMark(int[] coords, Player activePlayer) {

        board[coords[1] - 1][coords[0] - 1] = activePlayer.getMark();
    }


    private boolean isCellAvailable(int[] coords) {
        if (board[coords[1] - 1][coords[0] - 1] == Mark.EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isCoordValid(int[] coords) {
        if ((0 < coords[0] && coords[0] <= size) && (0 < coords[1] && coords[1] <= size)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean makeMove(int[] coords, Player player) {
        if (isCoordValid(coords) && isCellAvailable(coords)) {
            setMark(coords, player);
            return true;
        } else {

            return false;
        }
    }

    public String toString() {
        String boardString = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                switch (board[i][j]) {
                    case X:
                        boardString += "X ";
                        break;
                    case O:
                        boardString += "O ";
                        break;
                    case EMPTY:
                        boardString += "_ ";
                        break;
                }
            }
            boardString += '\n';
        }
        return boardString;
    }

    public int getSize() {
        return size;
    }

    public Mark[][] getBoard() {
        return board;
    }
}

