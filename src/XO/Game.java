package XO;

public class Game {
    private Player playerOne;
    private Player playerTwo;
    private GameBoard board;
    private Player activePlayer;
    private ConsoleReader cs;
    private boolean stillPlaying = true;
    private int size;

    public Game() {
        cs = new ConsoleReader();
    }

    public void start() {
        getBoardSize();
        this.board = new GameBoard(this.size);
        System.out.println(board.toString());
        getPlayers();
        setActivePlayer();

        while (stillPlaying) {
            int[] coords = cs.getCoords(activePlayer);
            board.makeMove(coords, activePlayer);
            System.out.println(board.toString());
            checkWinner();
            changeActivePlayer();
        }
    }

    //TODO: ogarnąć podawanie imion dla graczy
    private void getPlayers() {

        playerOne = new Player(cs.getPlayerName(1), Mark.X);
        playerTwo = new Player(cs.getPlayerName(2), Mark.O);

    }

    private void setActivePlayer() {
        activePlayer = playerOne;
    }

    private void changeActivePlayer() {
        if (activePlayer.equals(playerOne)) {
            activePlayer = playerTwo;
        } else {
            activePlayer = playerOne;
        }
    }

    private void checkWinner() {
        for (int i = 0; i < board.getSize(); i++) {
            if (checkRows(i)) {
                stillPlaying = false;
                printWinner();
                doContinue();
            } else if (checkColumns(i)) {
                stillPlaying = false;
                printWinner();
                doContinue();
            } else if (checkDiagonals()) {
                stillPlaying = false;
                printWinner();
                doContinue();
            }
        }
    }

    private boolean checkColumns(int iter) {
        boolean equals = false;
        Mark first = board.board[iter][0];
        for (int i = 0; i < board.getSize(); i++) {
            if (board.board[i][iter] == first && board.board[i][iter] != Mark.EMPTY) {
                equals = true;
            } else {
                equals = false;
            }
        }
        return equals;
    }

    private boolean checkRows(int iter) {

        boolean equals = false;
        Mark first = board.board[0][iter];
        for (int i = 0; i < board.getSize(); i++) {
            if (board.board[iter][i] == first && board.board[iter][i] != Mark.EMPTY) {
                equals = true;
            } else {
                equals = false;
            }
        }
        return equals;
    }

    private boolean checkDiagonals() {
        Mark first;
        for (int x = 0; x < 2; x++) {
            boolean equals = false;
            if (x == 1) {
                first = board.board[board.getSize() - 1][0];

                for (int i = 0, j = board.getSize() - 1; i < board.getSize(); i++, j--) {
                    if (board.board[j][i] == first && board.board[j][i] != Mark.EMPTY) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                }
                if (equals) {
                    return true;
                }
            } else if (x == 0) {
                first = board.board[0][0];
                for (int i = 0; i < board.getSize(); i++) {
                    if (board.board[i][i] == first && board.board[i][i] != Mark.EMPTY) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                }
                if (equals) {
                    return true;
                }
            }
        }
        return false;
    }

    private void printWinner() {
        System.out.println("Gracz " + activePlayer.getName() + " wygrywa!");
    }

    private void doContinue() {
        if (!stillPlaying) {
            String res = cs.doContinue();
            if (res.equals("Y") || res.equals("y")) {
                start();
            } else if (res.equals("X") || res.equals("x")) {
                System.out.println("Papa!");
            } else {
                doContinue();
            }
        }
    }

    private void getBoardSize(){
        int input = cs.getBoardSize();
        if(isBoardSizeValid(input)){
            this.size = input;
        } else{
            System.out.println("Błędny wymiar!");
            getBoardSize();
        }
    }
    private boolean isBoardSizeValid(int input){
        if(input<=0){
            return false;
        } else {
            return true;
        }
    }
}

